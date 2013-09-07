package open.bracket.framework.game.player;

import java.util.ArrayList;


public class Player<T extends Player<?>> {
	String Name;
	ArrayList<T> VictoryOver = new ArrayList<T>();
	ArrayList<T> LostTo = new ArrayList<T>();
	PlayerState State = PlayerState.DEFAULT;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public ArrayList<T> getVictoryOver() {
		return VictoryOver;
	}

	public void setVictoryOver(ArrayList<T> victoryOver) {
		VictoryOver = victoryOver;
	}

	public ArrayList<T> getLostTo() {
		return LostTo;
	}

	public void setLostTo(ArrayList<T> lostTo) {
		LostTo = lostTo;
	}

	public PlayerState getState() {
		return State;
	}

	public void setState(PlayerState state) {
		State = state;
	}
	
	public String toString(){
		return Name;
		
	}
	
	public String toScoreBoardDisplay(){
		return toString();
	}
}
