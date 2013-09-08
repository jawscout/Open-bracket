package open.bracket.framework.test;

import open.bracket.framework.FW;
import open.bracket.framework.game.Game;
import open.bracket.framework.game.GameEventType;
import open.bracket.framework.game.player.Player;

public class StandardGame implements Game {
	private boolean ready = false;
	private Player<?>[] players = null;

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isReady() {
		return ready;
	}

	@Override
	public Player<?>[] getPlayers() {
		return players;
	}

	@Override
	public int getGameSize() {
		return players.length;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String output = new String();
		output += "|Game: ";
		if (players == null) {
			output += "null|";
			return output;
		}
		if (players.length != 0) {
			output += players[0].getName();
			if (players.length < 1)
				for (int i = 1; i < players.length; i++) {
					output += " vs " + players[i].getName();
				}
		}
		else
		{
			output += "no players";
		}
		return output;
	}

	@Override
	public void makeGame(Player<?>[] players) {
		if (FW.getConfig().getNumberOfPlayersPerMatch() != players.length) {
			System.err.println("Player number not matching config" + players.length);
			
			return;
		}
		this.players = players;

	}

	GameEventType State = GameEventType.PreGame;

	@Override
	public GameEventType getGameState() {
		return State;
	}

	@Override
	public void setGameState(GameEventType state) {
		State = state;
	}

	Player<?>[] Winner = null;

	@Override
	public Player<?>[] getWinner() {
		// TODO Auto-generated method stub
		return Winner;
	}

	Player<?>[] Looser = null;

	@Override
	public Player<?>[] getLooser() {
		// TODO Auto-generated method stub
		return Looser;
	}

	@Override
	public void setWinner(Player<?>[] winner) {
		Player<?>[] tmpLooser = new Player<?>[players.length - winner.length];
		int l = 0;
		for (int i = 0; i < players.length; i++) {
			for (int w = 0; w < winner.length; i++) {
				if (players[i] != winner[w]) {
					tmpLooser[l++] = players[i];
				}
			}
		}
		Looser = tmpLooser;
		Winner = winner;
	}

}
