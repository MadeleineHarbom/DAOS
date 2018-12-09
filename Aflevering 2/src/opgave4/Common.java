package opgave4;

/**
 * An implementation of a queue as a circular array.
 */
public class Common {
	private String[] elements;
	public int currentSize;
	public int lastAdded;
	public int serving;
	public int taeller;
	public int size;

	/**
	 * Constructs an empty queue.
	 */
	public Common(int size) {
		this.size = size;
		elements = new String[this.size];
		currentSize = 0;
	}

	public synchronized void enqueue(String name) {
		currentSize++;
		taeller++;
		lastAdded = (lastAdded + 1) % elements.length;
		elements[lastAdded] = name;
		System.out.println(name + " er nu i koe");
	}

	public synchronized String dequeue() {
		if (currentSize == 0) {
			return null;
		}
		String removed = elements[serving];
		serving = (serving + 1) % elements.length;
		currentSize--;
		return removed;
	}


	public void tagerRandomTid(int max) {
		int r1 = (int) Math.abs(Math.random()*1000);
		int r2 = (int) Math.abs(Math.random()*1000);
		for (int i = 0; i < max; i += r1) {
			for (int j = 0; j < max*2; j += r2) {
				r2 = (int) Math.abs(Math.random()*1000);
			}
			r1 = (int) Math.abs(Math.random()*1000);
		}
	}


	public int size() {
		return currentSize;
	}
}
