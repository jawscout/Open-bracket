package open.bracket.framework.game;

import java.util.UUID;

public class GameEvent {
	private GameEventType state = GameEventType.PreGame;
	private final UUID id = UUID.randomUUID();
	
	public GameEventType getGameState() {
		return state;
	}

	public void setGameState(GameEventType newState) {
		state = newState;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof GameEvent)
		{
			if(((GameEvent)obj).id.equals(id))
				return true;
		}
		return false;
	}
	
}
