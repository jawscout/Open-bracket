package open.bracket.framework.game;

import java.util.UUID;

import open.bracket.framework.game.player.Player;

public interface Round {
	/**
	 * Check to see if the number of players fits into the games neatly
	 * @param players
	 * @return
	 */
	public boolean isPlayerNumberValid(int players);
	
	public void generateRound(Player<?>[] players);
	
	public UUID getUUID();
	
	public Game[] getGames();
	
	public void setGames(Game[] games);
	
	public void setNumberOfGames(int num);

	public int getNumberOfGames();
}
