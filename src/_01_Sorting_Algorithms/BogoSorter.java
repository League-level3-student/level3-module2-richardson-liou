package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most inefficient
	 * sorting algorithm while still maintaining the possibility of eventually
	 * sorting data.
	 * 
	 * It works by following these steps: STEP 1. Is the array in order? if yes,
	 * finished; if no, go to step 2. STEP 2. Take two random elements in the array
	 * and swap them. STEP 3. Go back to step 1.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		Random random = new Random();
		boolean isSorted = false;

		int counter = 0;

		while (isSorted == false) {
			counter = 0;
			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] > array[i + 1]) {
					counter = 1;
					System.out.println("Found out of place");
					break;
				}

			}
			if (counter != 0) {
				isSorted = false;
				int random1 = random.nextInt(array.length);
				int random2 = random.nextInt(array.length);
				int temp = array[random1];
				array[random1] = array[random2];
				array[random2] = temp;
				System.out.println("Sorting");
			} else {
				isSorted = true;
				System.out.println("Is sorted");
			}
			display.updateDisplay();
		}
	}
}
