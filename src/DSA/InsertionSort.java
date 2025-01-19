package DSA;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,9,7,6,3,4,6,7,3,5};
		int l = a.length, key = -1;
		System.out.println("Before");
		for (int i : a) {
			System.out.print(i+",");
		}

		for (int i = 1; i < l; i++) {
			key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key  ) {
				a[j + 1] = a[j];
				j--;
			}

			a[j + 1] = key;
			System.out.println();
			for (int n : a) {
				System.out.print(n+",");
			}
			
		}
		System.out.println("After Insertion sort");
		for (int n : a) {
			System.out.print(n+",");
		}

	}

}
