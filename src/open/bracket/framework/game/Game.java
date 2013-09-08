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

}
