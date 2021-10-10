package test;

public class ArrStock {
	public static void main(String[] args) {
		int ar[] = {7,1,5,3,6,4};
//		int ar[] = {7,6,4,3,1};
		int temp = ar[0];
		int a = 0;
		for(int i = 0; i<ar.length;i++) {
			if(temp>ar[i]) {
				temp = ar[i];
				a = i;
			}
		}System.out.println("Min value at day = "+a +"  value = "+temp);
		int abc = 0;
		int b = 0;
		for(int i = 0; i<ar.length; i++) {
			if(abc<ar[i] && (i>a)) {
				abc = ar[i];
				b = i;
			}
		}System.out.println("Max Value after buying stock on day = "+b +" value is  "+abc);
		if(a<b) {
			int profit = abc - temp;
			System.out.println("Profit = "+profit);
		}
		else {
			System.out.println("Profit = 0");
		}
	}

}
