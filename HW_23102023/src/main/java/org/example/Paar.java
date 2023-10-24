package org.example;
public class Paar<L,S> {
		private final L longKey;
		private final S shortsValue;

		public Paar(L longKey, S shortsValue) {
				this.longKey = longKey;
				this.shortsValue = shortsValue;
		}

		public L getLongKey() {
				return longKey;
		}

		public S getShortsValue() {
				return shortsValue;
		}

		@Override
		public String toString() {
				return "Pair{" +
						       "longKey=" + longKey +
						       ", shortsValue=" + shortsValue +
						       '}';
		}
}
