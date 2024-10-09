package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {

		boolean[] primeNum = new boolean[101];

		for (int i = 0; i < primeNum.length; i++) {
			primeNum[i] = true;
		}

		int numDivisor = 2;
		while (numDivisor < primeNum.length) {

			for (int i = numDivisor + 1; i < primeNum.length; i++) {

				if (i % numDivisor == 0) {
					primeNum[i] = false;
					continue;
				}
			}

			numDivisor += 1;

		}

		for (int i = 2; i < primeNum.length; i++) {
			if (primeNum[i]) {
				System.out.println(i);
			}
		}
	}
}
