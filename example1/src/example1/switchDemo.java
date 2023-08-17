package example1;

public class switchDemo {

	public static void main(String[] args) {

		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Gectiniz");
			break;

		case 'B':
		case 'C':
			System.out.println("İyi : Gectiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Gectiniz");
			break;
		case 'F':
			System.out.println("Malesef : Kaldiniz");
			break;
		default:
			System.out.println("Gecersiz not girdiniz");
		}

	}

}
