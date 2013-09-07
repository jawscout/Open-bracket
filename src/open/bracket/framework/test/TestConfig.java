package open.bracket.framework.test;

import open.bracket.framework.game.GameConfig;
import open.bracket.framework.game.Match;
import open.bracket.framework.game.Round;
import open.bracket.framework.game.player.Player;

public class TestConfig implements GameConfig{

	@Override
	public int getNumberOfRounds() {
		return 3;
	}

	@Override
	public int getNumberOfPlayers() {
		return 12;
	}

	@Override
	public int getNumberOfPlayersPerMatch() {
		return 2;
	}

	@Override
	public int getNumberOfWinnersPerMatch() {
		return 1;
	}
	
	@Override
	public Class<? extends Match> getMatchType() {
		return TestMatch.class;
	}

	@Override
	public Class<? extends Round> getRoundType() {
		return TestRound.class;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class<? extends Player> getPlayerType() {
		return StandardPlayer.class;
	}

	@Override
	public int getNumberOfStartingMatches() {
		return 3;
	}

	@Override
	public boolean loadGame() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void makeMatches(Player<?>[] players) {
		// TODO Auto-generated method stub
		for(Player<?> p : players)
		System.out.println(p);
	}

}
