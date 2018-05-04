
public class MAIN {

	public final static short k = 10; // Number of Threads for each Sorter
	public final static int N = 1000; // number of Values to sort

	public static void main(String[] args) {

		for (int i = 0; i < k; i++) {
			new Bubbler(i).start(); // Bubble gets a head start
			new Heaper(i).start();
		}
	}

}
