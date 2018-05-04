
import java.util.PriorityQueue;

public class Heap<T> {

	/*
	 * Min-Heap data structure
	 */
	private PriorityQueue<T> Q;

	/*
	 * Default Constructor: wraps an empty Priority Queue
	 */
	public Heap() {
		this.Q = new PriorityQueue<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.Q.toString();
	}

	/*
	 * Constructor: wraps a Priority Queue from given values
	 */
	public Heap(@SuppressWarnings("unchecked") T... values) {
		this.Q = new PriorityQueue<>();
		for (T value : values)
			this.Q.offer(value);
	}

	/*
	 * Inserts value into Heap, wraps Priority Queue method "offer()"
	 */
	public void insert(T value) {
		this.Q.offer(value);
	}

	/*
	 * Inserts given values into Heap, wraps Priority Queue method "offer()"
	 */
	public void insertAll(@SuppressWarnings("unchecked") T... values) {
		for (T value : values)
			this.Q.offer(value);
	}

	/*
	 * Heapsort:
	 * 
	 * (1) Create a heap from given data values. (2) Pop root value into new
	 * array. Root value will always be the minimum value. (3) Heapify the
	 * remaining heap. This is done automatically by the PriorityQueue class.
	 * (4) repeat until heap is empty.
	 * 
	 * O(n lg n)
	 */
	public int[] Heapsort(int... values) {
		int[] result = new int[this.Q.size()];
		PriorityQueue<T> temp = new PriorityQueue<>(this.Q);

		/*
		 * Ascending ::::::::: for (int i = 0; i < this.Q.size(); i++)
		 * Descending :::::::: for (int i = this.Q.size() - 1; i >= 0; i--)
		 */
		for (int i = 0; i < this.Q.size(); i++)
			result[i] = (int) temp.poll();

		return result;
	}

}
