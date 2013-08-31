package open.bracket.framework.game;

import open.bracket.framework.game.player.Player;

public interface Round {
	public void setPlayers(Player<? extends Player<?>>[] players);

	public Player<? extends Player<?>>[] getPlayers();
	
	public void makeRound();
	
	public boolean isRoundFinished();
	
	
}
