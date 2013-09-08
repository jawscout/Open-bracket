package open.bracket.framework.bracket;

import open.bracket.framework.FW;
import open.bracket.framework.game.Round;
import open.bracket.framework.game.player.Player;

/**
 * This is the bracket object. This holds the bracket instance
 * 
 * @author Jake Wilkinson
 * 
 */
public class Bracket {
	private Round[] rounds;

	public Bracket() {

	}

	public void buildBracket(Player<?>[] players) {
		for (Player<?> p : players)
			System.out.println(p);
		double rnds = (Math.log(players.length) / Math.log(FW.getConfig()
				.getNumberOfPlayersPerMatch()));
		// TODO: Handle uneven team numbers
		if (rnds % 1 != 0) {
			System.err.println("Invalid player number");
			return;
		}
		rounds = new Round[(int) rnds];
		Player<?>[] tmpplar;
		for (int i = 0; i < rounds.length; i++) {
			tmpplar = new Player<?>[FW.getConfig().getNumberOfPlayersPerMatch()];
			for (int x = 0; x < tmpplar.length; x++) {
				tmpplar[x] = players[((i+1)*(x+1))-1];
				System.out.println(tmpplar[x]);
				
			}
			try {
				rounds[i] = FW.getConfig().getRoundType().newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rounds[i].generateRound(tmpplar);
		}
	}

	public void start() {

	}
}
