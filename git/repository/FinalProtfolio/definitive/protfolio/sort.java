package definitive.protfolio;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JBL");

		int[] myNum = {5, 2, 4, 6,1,3};
		int j;
		int ii, key;
		for (j=1; j < myNum.length; j++) {
			//System.out.println(myNum[j]);
		
		
		key=myNum[j];
		ii=j-1;
		while (ii>0 & myNum[ii]>key) {
			myNum[ii+1]= myNum[ii];
			ii=ii-1;
			myNum[ii+1]=key;
			//System.out.println(myNum[ii+1]);
		}
		
		}
		System.out.println("JBL");
		
		System.out.println(myNum.length);
		for (int i = 0; i < myNum.length; i++) {
			System.out.println(myNum[i]);
		
		

	}

	}}
