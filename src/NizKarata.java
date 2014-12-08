public class NizKarata {
	public static void main(String[] args) {
	int [] spil= noviSpil();
	System.out.println("Novi spil: " + nizUstring(spil));
	
	int brojPromjena=100;
	for( int i =0; i<brojPromjena; i++) {
		zamijeniDvijeKarte (spil);
	}
	System.out.println("Novi spil: " + nizUstring(spil));

	}

	private static int zamijeniDvijeKarte(int[] spil) {
		// TODO Auto-generated method stub
		int prva =randomKarta (spil);
		int druga = randomKarta (spil);
		zamijeni (spil, prva, druga);
		
		return spil, prva, druga;
	}

	public static int[] noviSpil() {
		int[] karte = new int[52];
		for (int i = 1; i < karte.length; i++) {
			karte[i] = i++;

		}
		return karte;
	}
//
	
	private static String nizUstring(int[] niz) {
		if (niz.length == 0) {
			return "";
		}

		String strNiz = String.valueOf(niz[0]);
		for (int idx = 1; idx < niz.length; idx++) {
			strNiz = strNiz + niz[idx] + ", ";
		}
		return strNiz;
	}
//
	
	private static int randomKarta ( int[]spil) {
		return (int)(Math.random() *52);
	}
	private static void zamijeni(int[] niz, int idx1, int idx2) {
		int temp =niz[idx1];
		niz[idx1] =niz[idx2];
		niz[idx2] = temp;
		return idx1,idx2;
				
	}

}
