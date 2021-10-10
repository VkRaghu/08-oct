package test;

public class ArrRevInNew {
	public static void main(String[] args) {
		int ar[]= {2,4,30,10,7};
		int n = ar.length;
		int br[] = new int[n];
		for(int i = ar.length-1; i>=0; i--) {
			br[(n-1)-i]=ar[i];
			
		}
		for(int i = 0; i<br.length; i++) {
			System.out.println(br[i]);
		}
	}
}
