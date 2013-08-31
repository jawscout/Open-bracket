package open.bracket.framework;

public enum EventState {
	DEFAULT {
		@Override
		public int getState() {
			return -0x1;
		}
	},
	CREATED {
		@Override
		public int getState() {
			return 0x0;
		}
	},
	RUNNING {
		@Override
		public int getState() {
			return 0x1;
		}
	},
	COMPLETE {
		@Override
		public int getState() {
			return 0x2;
		}
	},
	ERROR {
		@Override
		public int getState() {
			return 0x3;
		}
	};
	public abstract int getState();
	
	@Override
	public String toString() {
		return "" + getState();
	}
	
}
