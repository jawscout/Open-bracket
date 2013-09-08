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
		Player<?>[] tmpplar = null;
		System.out.println("Players: " + players.length);
		int length = players.length;
		for (int b = 0; b < rounds.length; b++) {
			try {
				rounds[b] = FW.getConfig().getRoundType().newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (b == 0)// first round
			{
				/*for (int i = 0; i < players.length
						/ FW.getConfig().getNumberOfPlayersPerMatch(); i++) {
					tmpplar = new Player<?>[FW.getConfig()
							.getNumberOfPlayersPerMatch()];
					for (int x = 0; x < tmpplar.length; x++) {
						tmpplar[x] = players[(((i + 1) * FW.getConfig()
								.getNumberOfPlayersPerMatch()) - x) - 1];
					}
				}*/
				rounds[b].generateRound(players);
			}
			else
			{// Fill in null players for all other spaces
				length = length/(FW.getConfig().getNumberOfPlayersPerMatch()/FW.getConfig().getNumberOfWinnersPerMatch());
				tmpplar = new Player<?>[length];
				for(int i = 0; i < tmpplar.length; i++)
				{
					tmpplar[i] = new Player<>(true);
				}
				rounds[b].generateRound(tmpplar);
			}
		}
	}

	public void start() {

	}
}
