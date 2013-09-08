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
		// TODO Auto-generated method stub
		return ready;
	}

	@Override
	public Player<?>[] getPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getGameSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void makeGame(Player<?>[] players) {
		if(FW.getConfig().getNumberOfPlayersPerMatch() != players.length)
		{
			System.err.println("Player number not matching config");
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
		for(int i = 0; i < players.length; i++)
		{
			for(int w = 0; w < winner.length; i++)
			{
				if(players[i] != winner[w])
				{
					tmpLooser[l++] = players[i];
				}
			}
		}
		Looser = tmpLooser;
		Winner = winner;
	}

}
