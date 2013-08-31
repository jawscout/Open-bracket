package open.bracket.framework;

import open.bracket.framework.game.GameConfig;
import open.bracket.framework.test.TestConfig;

public final class FW {
	private GameConfig config;

	protected FW() {

	}

	private static FW instance = null;

	public static FW getFW() {
		return instance;
	}

	public void start() {
		checkConfig();
	}

	public boolean checkConfig() {

		/*
		 * Should check the config for problems that may arise during game play
		 */
		if (config != null)

			return true;
		return false;
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
}
