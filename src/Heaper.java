
//import java.util.Arrays;
import java.util.Random;

/*
 * Thread exists to execute an instance of Heapsort
 */
public class Heaper extends Thread {

	private int name;

	public Heaper(int name) {
		this.name = name + 1; // starting at 1
	}

	public void run() {
		Integer[] values = new Integer[MAIN.N];

		for (int i = 0; i < values.length; i++)
			values[i] = new Random().nextInt(MAIN.N);

		Heapsort(values);
	}

	/*
	 * O(n lg n)
	 */
	private void Heapsort(Integer... values) {

		Heap<Integer> heap = new Heap<>(values);

		System.out.println("HEAPED DONE\t" + this.name);

		heap.Heapsort();

		System.out.println("SORTED DONE\t" + this.name);

		// System.out.println(this.name+"-SORTED: "+ Arrays.toString(heap.Heapsort()));
	}
}
