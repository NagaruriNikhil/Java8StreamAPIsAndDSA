package DSA;

public class LinearAndBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5 };

		int target = 5;

		int result = linearSearch(a, target);
		int res = binarySearch(a, target,0,a.length-1);

		if (res == -1) {
			System.out.println("Not found");
		} else {
			System.out.println(res);
		}
	}

	private static int binarySearch(int[] a, int t, int l, int r) {
		// TODO Auto-generated method stub
//		int l = 0, r = a.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (t == a[mid]) {
				return mid;
			} else if (t < a[mid]) {
				return binarySearch(a, t, l, mid-1);

			} else {
				return binarySearch(a, t, mid+1, r);
			}
		}
		return -1;
	}

	private static int linearSearch(int[] a, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
