package open.bracket.framework.test;

import java.util.UUID;

import open.bracket.framework.FW;
import open.bracket.framework.game.Game;
import open.bracket.framework.game.Round;
import open.bracket.framework.game.player.Player;

public class TestRound implements Round {

	private final UUID id = UUID.randomUUID();

	@Override
	public boolean isPlayerNumberValid(int players) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void generateRound(Player<?>[] players) {
		Game[] tmpgames = new Game[players.length
				/ FW.getConfig().getNumberOfPlayersPerMatch()];
		for (int i = 0; i < tmpgames.length; i++) {
			try {
				tmpgames[i] = FW.getConfig().getGameType().newInstance();
				Player<?> tmpplar[] = new Player<?>[FW.getConfig()
						.getNumberOfPlayersPerMatch()];
				for (int x = 0, tmp = FW.getConfig()
						.getNumberOfPlayersPerMatch(); x < tmpplar.length; x++) {
					// build the players for each game
					
							tmpplar[x] = players[ (((i + 1) * FW.getConfig().getNumberOfPlayersPerMatch() - (tmp)))];
					tmp--;
				}
				tmpgames[i].makeGame(tmpplar);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		games = tmpgames;
	}

	@Override
	public UUID getUUID() {
		return id;
	}

	private Game[] games = null;

	@Override
	public Game[] getGames() {
		return games;
	}

	@Override
	public void setGames(Game[] games) {
		this.games = games;
	}

	private int numberOfGames = -1;

	@Override
	public void setNumberOfGames(int num) {
		numberOfGames = num;

	}

	@Override
	public int getNumberOfGames() {
		return numberOfGames;
	}

	public String toString() {
		String out = new String();
		if (games != null) {
			for (int i = 0; i < games.length; i++) {
				out += "| " + games[i].toString();
			}
		}
		return out;
	}

}
