package test;

public class ArrRev {
	public static void main(String[] args) {
		int []a = {1,2,10,4,5};
		int temp = 0; 
		for(int i = 0; i<a.length/2; i++) {
			temp = a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
			
		}
		for(int i : a) {
			System.out.print(" "+i);
		}
	}

}
