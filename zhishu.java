public class zhishu {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {

				if (i % j == 0) {
					break;
				}
				if (j >= (i - 1)) {
					sum++;
					System.out.println(i);
				}
			}
		}
		System.out.println(sum + 1);
	}
}
