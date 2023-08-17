package example1;

public class recapDemo2 {

	public static void main(String[] args) {
		
		//double [] myList = new double [4];
		
		
		double [] myList = {1.2, 6.3, 4.3,5.6};
		/*
		for(int i=0; i<myList.length; i++) {
			System.out.println(myList[i]);
			
		}
		
		System.out.println("-----------");
		*/
		
		double total = 0;
		double max = myList[0];
		
		for (double number:myList) {
			if(max<number) {
				max=number;
			}
			
			System.out.println(number);
			total+= number;
			
		}
		System.out.println("Toplam : " + total);
		System.out.println("En buyuk sayi : " + max);
		
		
	

	}

}
