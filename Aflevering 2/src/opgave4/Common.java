package opgave4;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a circular array.
 */
public class Common {
	private String[] elements;
	public int currentSize;
	public static int lastAdded;
	public static int serving;
	public static int taeller;
	public int size;

	/**
	 * Constructs an empty queue.
	 */
	public Common(int size) {
		this.size = size;
		elements = new String[this.size];
		currentSize = 0;

	}


	public boolean isEmpty() {
		return currentSize == 0;
	}



	public void enqueue(String name) {
		currentSize++;
		elements[lastAdded+1] = name;
		lastAdded = (lastAdded + 1) % elements.length;
	}


	public Object dequeue() {
		if (currentSize == 0) {
			throw new NoSuchElementException();
		}
		Object removed = elements[serving];
		serving = (serving + 1) % elements.length;
		currentSize--;
		return removed;
	}




	public synchronized int getKoeNummerDelete() {
		while (currentSize >= this.size) {

		}
		int temp = taeller;
		tagerRandomTid(200);
		taeller = temp +1;
		System.out.println("Jeg fik nummer " +  taeller);
		return taeller;
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
