package Java8;

import java.util.Arrays;

public class QuickSort {
	
	
	public static void quicksort(int[] a, int l, int h ) {
		if(l<h)
		{
			int pi = partition(a, l,h);
			
			quicksort(a, l, pi-1);
			quicksort(a, pi+1, h);
		}
	}

	private static int partition(int[] a, int l, int h) {
		// TODO Auto-generated method stub
		int pivot = a[h];
		int i= l-1;
		for(int j=l;j<h;j++) {
			if(a[j]<=pivot) {
				i++;
				swap(a, i, j);
			}
		}

		swap(a, i+1, h);
		return i+1;
	}

	private static void swap(int[] a,int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-2,1,3,1,-3,8,2,0};
		System.out.println("Array before quick sort: "+ Arrays.toString(a));
		quicksort(a, 0, a.length-1);
		
		System.out.println("Array after quick sort: "+ Arrays.toString(a));
	}

}
