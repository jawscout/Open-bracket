package open.bracket.framework;

import java.util.ArrayList;

import open.bracket.framework.bracket.Bracket;
import open.bracket.framework.game.GameConfig;
import open.bracket.framework.game.GameEvent;
import open.bracket.framework.test.StandardPlayer;
import open.bracket.framework.test.TestConfig;

public final class FW {

	private static GameConfig config;
	private static PresistantAgent agent = null;

	protected FW() {

	}
	
	public static GameConfig getConfig(){
		return config;
	}
	public static void addUpdate(GameEvent update)
	{
		if(agent == null)
		{
			System.err.println("Agent not started");
			return;
		}
		PresistantAgent.addUpdate(update);
		
	}

	public static PresistantAgent getAgent() {
		return agent;
	}

	public void start() {
		if (!checkConfig())
			return;
		// Test data
		StandardPlayer players[] = new StandardPlayer[8];
		for (int i = 0; i < players.length; i++) {
			players[i] = new StandardPlayer();
			players[i].setName("Player " + (i + 1));
		}
		//
		Bracket b = new Bracket();
		b.buildBracket(players);
		agent = new PresistantAgent(b);
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
		FW instance = new FW();
		FW.config = new TestConfig();
		instance.start();
		// For now I will use the test classes

	}

	private static final class PresistantAgent extends Thread {
		private static Bracket instance = null;

		private PresistantAgent(Bracket bracket) {
			instance = bracket;
			updates = new ArrayList<GameEvent>();
			start();
		}

		private static ArrayList<GameEvent> updates = null;

		public static void addUpdate(GameEvent update) {
			updates.add(update);
		}

		/**
		 * Main run loop
		 */
		public void run() {
			// check for invalid order of method calls
			if (instance == null)
				return;
			// start game loop
			while (true) {
				if (updates != null && updates.size() > 0) {
					for(GameEvent e : updates)
					{
						//update bracket and remove update form list
						
						updates.remove(e);
					}//End update loop
					
				}
				
			}//End game loop
			
		}
	}
}
