package demo_bubble;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int ar[]= {11,21,1,33,1,3,5,6,100,22,33,45};
		System.out.println("Bubble sort demo.....\n");
		System.out.println("Before Sort : "+Arrays.toString(ar));
		sort(ar);
		System.out.println("After Sort : "+Arrays.toString(ar));

	}
	
	public static void sort(int ar[]) {
		for (int i = 0; i < ar.length-1; i++) {
			
			for (int j = 0; j < ar.length-i-1; j++) {
				
				if(ar[j] > ar[j+1] ) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}

}

//Task - Try Insertion Sort
