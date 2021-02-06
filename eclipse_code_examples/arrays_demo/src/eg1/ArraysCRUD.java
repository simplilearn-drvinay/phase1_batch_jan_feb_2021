package eg1;

public class ArraysCRUD {

	public static void main(String[] args) {
		int ar[] = new int[6];
		int n = 0;
		printArray(ar, n);
		ar[0]=12;
		ar[1]=22;
		ar[2]=5;
		n=3;
		printArray(ar, n);
		int ele=100;
		int pos=3;
		for(int i=n;i>pos-1;i--) {
			ar[i]=ar[i-1];
		}
		ar[pos-1]=ele;
		n++;
		System.out.println("\nPrinting array after insertion");
		printArray(ar, n);
		
		int delpos=2;
		for (int i = delpos-1; i < n; i++) {
			ar[i]=ar[i+1];
		}
		n--;
		System.out.println("\nPrinting array after insertion");
		printArray(ar, n);

	}

	public static void printArray(int ar[], int n) {
		if (n == 0) {
			System.out.println("Array is empty");
		} else {
			System.out.println("Printing elements in array");
			for (int i = 0; i < n; i++) {
				System.out.print(ar[i] + " ");
			}
		}
	}

}
