package example1;

public class stringTrainingDemo {

	public static void main(String[] args) {
		
		String kitapIsmi = "   Oguz Atay Tutunamayanlar   ";
		
		System.out.println(kitapIsmi);
		
		System.out.println(kitapIsmi.indexOf('A'));
		System.out.println(kitapIsmi.indexOf("Tut"));
		
		System.out.println(kitapIsmi.lastIndexOf('a'));
		
		System.out.println(kitapIsmi.replace(' ', '-'));
		System.out.println(kitapIsmi.replace('a', '*'));
		
		String yeniKİtapIsmi = kitapIsmi.replace('a', '*');
		System.out.println(kitapIsmi);
		System.out.println("------------");
		System.out.println(yeniKİtapIsmi);
		
		
		System.out.println("*****************");
		
		System.out.println(kitapIsmi.length());
		System.out.println(yeniKİtapIsmi.length());
		
		System.out.println(kitapIsmi.charAt(5));
		System.out.println(yeniKİtapIsmi.charAt(7));
		
		System.out.println(kitapIsmi.concat("//" + yeniKİtapIsmi));
		
		System.out.println(kitapIsmi.substring(3));
		System.out.println(kitapIsmi.substring(3,7));
		
		System.out.println("****----****");
		
		for (String book : kitapIsmi.split("a")) {
			System.out.println(book);
		}
		
		System.out.println(kitapIsmi.toLowerCase());
		System.out.println(kitapIsmi.toUpperCase());
		
		System.out.println(kitapIsmi.trim());
		
		
	}

}
