public class PredavanjeTest1 {

	public static void main(String[] args) {
		int[] arr3 = new int[] { 1, 2, 4 };
		int[] arr = new int[] { 1, 2, 4, 56, 78 };
		// arr3 [1]=5;
		System.out.println(getMax(arr3));
		System.out.println(getMax(arr));
		System.out.println(nizUstring(arr));
	}

	/**
	 * System.out.println(zamijeni(int[]arr,0,4)); }
	 * 
	 * private static void zamijeni(int[] niz, int idx1, int idx2) { int temp
	 * =niz[idx1]; niz[idx1] =niz[idx2]; niz[idx2] = temp; return idx1,idx2;
	 * 
	 * }
	 */

	private static void print(int[] niz) {
        for (int temp:  niz) {
        	System.out.println(temp);
        }
 
	}
	
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

	private static int getMax(int[] brojevi) {
		int max = brojevi[0];
		for (int idx = 1; idx < brojevi.length; idx++) {
			int trenutni = brojevi[idx];
			if (trenutni > max) {
				max = trenutni;
			}

		}
		return max;

		// int a = niz3[0];
		// int b = niz3[1];
		// int c = niz3[2];

		// if (a>c && a>b) {
		// return a;
		// } else if (b>c) {
		// return b;
		// }
		// return c;
	}
}
