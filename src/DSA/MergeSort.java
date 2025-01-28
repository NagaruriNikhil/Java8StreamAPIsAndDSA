package DSA;

import java.util.Arrays;

public class MergeSort {

	
	public static void mergeSort(int[] a) {
		if( a.length <2)
		{
			return;
		}
		
		int m = a.length/2;
		
		int[] l = Arrays.copyOfRange(a, 0, m);
		int[] r = Arrays.copyOfRange(a, m, a.length);
		
		mergeSort(l);
		mergeSort(r);
		
		merge(a, l, r);
	}
	
	public static void merge(int[] a, int[] b, int[] c) {
		int i=0,j=0,k=0;
		
		while(i< b.length && j< c.length) {
			if(b[i] <= c[j]) {
				a[k++] = b[i++];
			} else {
				a[k++] = c[j++];
			}
		}
		
		while(i< b.length) {
			a[k++] = b[i++];
		}
		
		while(j< c.length) {
			a[k++] = c[j++];
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] a = {1,4,5,2,6,3,5,9,3};
		
		System.out.println("Unsorted array"+ Arrays.toString(a));
		mergeSort(a);

		System.out.println("Sorted array"+ Arrays.toString(a));
		
	}
}
