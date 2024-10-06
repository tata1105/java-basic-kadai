package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {

		int userAge = 3;
		int serviceCost = 3;

		switch (userAge) {
		case 1 -> System.out.println("10代");
		case 2 -> System.out.println("20代");
		case 3 -> System.out.println("30代");
		case 4 -> System.out.println("40代");
		case 5 -> System.out.println("50代");
		case 6 -> System.out.println("60代");
		case 7 -> System.out.println("70代");
		case 8 -> System.out.println("80代");
		default -> System.out.println("上記以外の年代");
		}

		switch (serviceCost) {
		case 1 -> System.out.println("1000円");
		case 2 -> System.out.println("2000円");
		case 3 -> System.out.println("3000円");
		case 4 -> System.out.println("3000円");
		case 5 -> System.out.println("4000円");
		case 6 -> System.out.println("4000円");
		case 7 -> System.out.println("4000円");
		case 8 -> System.out.println("5000円");
		default -> System.out.println("500円");
		}

	}

}
