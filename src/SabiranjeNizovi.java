public class SabiranjeNizovi {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int rez =  zbir (a,b);
		
		System.out.println(rez);
		ispisiZbir(a, b);
		
		int [] niz1 = new int [3] ; 
		niz1 [0] = 12;
		niz1 [1] = 1;
		niz1 [2] = 23;
		
		int zbir1 = zbirBrojevaUNizu(niz1);
		System.out.println(zbir1);
		
		int [] niz100 = new int [100] ;
		for( int i =1; i< niz100.length; i++) {
			niz100[i] = i+1;
			
		}
		System.out.println(zbirBrojevaUNizu(niz100));
	}
	
	public static int zbir (int i1, int i2) {
		return i1 +i2;
	}
	
	public static int zbirBrojevaUNizuForEach( int[] brojevi) {
		int sum =0;
		for ( int broj : brojevi) {
			sum += broj;
		}
		return sum;
	}
	public static int zbirBrojevaUNizu( int[] brojevi) {
		int sum =0;
		for ( int i =1; i<brojevi.length; i++) {
			int broj = brojevi[i];
			sum = sum + broj;
		}
		return sum;
	}

	public static void ispisiZbir( int i1, int i2) {
		System.out.println(i1+i2);
	}
}	
