package open.bracket.framework;

import open.bracket.framework.game.GameConfig;
import open.bracket.framework.game.player.Player;
import open.bracket.framework.test.StandardPlayer;
import open.bracket.framework.test.TestConfig;

public final class FW {
	
	private static GameConfig config;

	protected FW() {

	}

	private static FW instance = null;

	public static FW getFW() {
		return instance;
	}

	public void start() {
		if (!checkConfig())
			return;
		// Test data
		StandardPlayer players[] = new StandardPlayer[8];
		for (int i = 0; i < players.length; i++) {
			players[i] = new StandardPlayer();
			players[i].setName("Player " + (i+1));
		}
		//
		makeMatches(players);
		
	}

	
	public boolean checkConfig() {

		/*
		 * Should check the config for problems that may arise during game play
		 */
		if (config != null)

			return true;
		return false;
	}

	public void makeMatches(Player<?> players[]) {
		config.makeMatches(players);
	}

	/**
	 * 
	 * @param config
	 */
	public static void main(String... config) {
		instance = new FW();
		instance.config = new TestConfig();
		instance.start();
		// For now I will use the test classes

	}
	private static class PresistantAgent extends Thread{
		
	}
}
