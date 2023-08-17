package intro;

public class Main {

	//main java da başlangıç methodu'dur
	public static void main(String[] args) {
		
	System.out.println("Hello world!");
		
		//değisken isimlendirmeleri java da camelCase yazılır
		String ortaMetin = "ilginizi cekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println("ortaMetin");
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		}
		else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);

		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
				
		}

		/*
		String kredı1 = "Hızlı Kredi";
		String kredı2 = "Kredi X";
		String kredı3 = "Kredi Y";
		*/
		
		//array
		
		String [] krediler = {"Hızlı Kredi", "Maasini Halkbanktan", "Mutlu Emekli"};
		
		//System.out.println(krediler[0]);
		//System.out.println(krediler[1]);
		//System.out.println(krediler[2]);
		
		
		for (int i = 0; i < krediler.length; i++) {
			
			System.out.println(krediler[i]);
		}
		
		
		
	}

}
