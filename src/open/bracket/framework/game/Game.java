package open.bracket.framework.game;

import open.bracket.framework.game.player.Player;

/**
 * Rounds are made up of games
 * 
 * @author Jake Wilkinson
 * 
 */
public interface Game {
	public void start();

	public boolean isReady();

	public Player<?>[] getPlayers();

	public int getGameSize();
	
	public void makeGame(Player<?>[] players);
	
	public GameEventType getGameState();
	
	public void setGameState(GameEventType state);
	
	public Player<?>[] getWinner();
	
	public Player<?>[] getLooser();
	
	public void setWinner(Player<?>[] winner);

}
