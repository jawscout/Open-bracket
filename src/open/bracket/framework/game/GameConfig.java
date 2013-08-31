package open.bracket.framework.game;

import open.bracket.framework.game.player.Player;

public interface GameConfig {
	public int getNumberOfRounds();

	public int getNumberOfPlayers();

	public int getNumberOfPlayersPerMatch();

	public int getNumberOfWinnersPerMatch();

	public int getNumberOfStartingMatches();

	public boolean loadGame();

	public Class<? extends Match> getMatchType();

	public Class<? extends Round> getRoundType();

	@SuppressWarnings("rawtypes")
	public Class<? extends Player> getPlayerType();

}
