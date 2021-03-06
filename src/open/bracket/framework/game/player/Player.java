package open.bracket.framework.game.player;

import java.util.ArrayList;
import java.util.UUID;

public class Player<T extends Player<?>> {
	String Name;
	ArrayList<T> VictoryOver = new ArrayList<T>();
	ArrayList<T> LostTo = new ArrayList<T>();
	PlayerState State = PlayerState.DEFAULT;
	boolean isNull = false;
	public final UUID uuid = UUID.randomUUID();
	public String getName() {
		return Name;
	}
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public boolean isNull(){
		return isNull;
	}
	public Player(boolean isnull){
		isNull = isnull;
		Name = "TBA";
	}
	public void setName(String name) {
		Name = name;
	}
//Possibly unnecessary
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

	public String toString() {
		return Name + " " + String.valueOf(uuid);

	}

	public String toScoreBoardDisplay() {
		return toString();
	}
}
