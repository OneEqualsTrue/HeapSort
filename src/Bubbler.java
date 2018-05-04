import java.util.Random;

/*
 * Thread exists to show speed comparison for Heapsort vs. Bubblesort
 */
public class Bubbler extends Thread {

	private int name;

	public Bubbler(int name) {
		this.name = name;
	}

	public void run() {
		int[] values = new int[MAIN.N];

		for (int i = 0; i < values.length; i++)
			values[i] = new Random().nextInt(MAIN.N);

		Bubblesort(values);
	}

	/*
	 * O(n^2)
	 */
	private void Bubblesort(int... values) {

		for (int i = 0; i < values.length; i++)
			for (int j = 0; j < values.length; j++)
				if (values[i] < values[j]) {
					int temp = values[i];
					values[i] = values[j];
					values[j] = temp;
				}

		System.out.println("BUBBLE DONE\t" + this.name + "\t*");
	}

}
