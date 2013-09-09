
package open.bracket.framework;

public abstract class Event {

	private EventState State = EventState.DEFAULT;
	private long StartTime = 0L;
	private long CompleteTime = 0L;

	public EventState getState() {
		return State;
	}

	public void setState(EventState state) {
		State = state;
	}

	public long getStartTime() {
		return StartTime;
	}

	public void setStartTime(long startTime) {
		StartTime = startTime;
	}

	public long getCompleteTime() {
		return CompleteTime;
	}

	public void setCompleteTime(long completeTime) {
		CompleteTime = completeTime;
	}

	public abstract String toString();
}
