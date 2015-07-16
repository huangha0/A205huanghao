import java.util.Scanner;

public class text1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("«Î ‰»Î––∫≈£∫");
		int num = scanner.nextInt();
		// if (num < 10) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				if (i < 10) {
					System.out.print(i);
					continue;
				} else {

					char num1 = (char) ('A' + (i - 10));
					System.out.print(num1);

				}
			}

			System.out.println();
		}
	}
}
