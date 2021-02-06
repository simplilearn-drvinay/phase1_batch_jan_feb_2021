package eg1;

public class ArraysDemo1 {

	public static void main(String[] args) {
		
		int ar[]= {12,33,12,12,33,44,5,5,324};
		
		System.out.println("ar[0] = "+ar[0]);
		
		System.out.println("Printing all array elements");
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"] : "+ar[i]);
		}
		
		System.out.println("Printing all even numbers in array ");
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0) {
			System.out.println("ar["+i+"] : "+ar[i]);
			}
		}
		
		System.out.println("Printing sum of all odd numbers in array ");
		int odd=0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2!=0) {
			odd+=ar[i];
			}
		}
		System.out.println(odd);


	}

}
