package DSA;

public class Queue {

	private int front =0;
	private int rear = -1;
	private int size = 0;
	private int[] arr= new int[4];
	
	public void enqueue(int data) {
		rear++;
		arr[rear]= data;
		size++;
	}
	
	public void print() {
		for(int i=front;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public int dequeue() {
		int data= arr[front];
		
		front= front+1;
		return data;
		
	}

}
