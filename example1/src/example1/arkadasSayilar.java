package example1;

public class arkadasSayilar {

	public static void main(String[] args) {
		
		//220-284  
		
		int number1 = 225;
		int number2 = 284;
		
		int total1 = 0;
		int total2 = 0;
		
		for (int i=1; i<number1; i++) {
			if(number1 % i == 0) {
				total1 =total1 + i;
			}
		}
		
		for (int j=1; j<number2; j++) {
			if(number2 % j == 0) {
				total2 =total2 + j;
			}
		}
		
		if (total1==number2) {
			if (total2==number1) {
				System.out.println("number1 ve number2 arkadaş sayıdır :" +number1 + " " +number2);
				
			}
			
		}else {
			System.out.println("number1 ve number2 arkadaş sayı değildir :" +number1 + " " +number2);
		}
		

	}

}
