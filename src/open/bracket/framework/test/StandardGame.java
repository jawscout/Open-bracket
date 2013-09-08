package open.bracket.framework.test;

import open.bracket.framework.game.Game;
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

}
