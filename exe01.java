import java.security.PublicKey;
import java.util.*;

public class exe01 {

	private static Random random;

	/**
	 * @param args
	 * @param Random
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// 定义一个20*5的二维数组，用来存储某班级20位学员的5门课的成绩；
		// 这5门课按存储顺序依次为：core C++，coreJava，Servlet，JSP和EJB。
		// (1)循环给二维数组的每一个元素赋0~100之间的随机整数。
		// (2)按照列表的方式输出这些学员的每门课程的成绩。
		// （3）要求编写程序求每个学员的总分，将其保留在另外一个一维数组中。
		// （4）要求编写程序求所有学员的某门课程的平均分。
		int score[][] = new int[20][5];
		System.out.println("core C++" + "\t" + "coreJava" + "\t" + "Servlet"
				+ "\t" + "\t" + "JSP" + "\t" + "\t" + "EJB");
		for (int i = 0; i <= 19; i++) {
			for (int j = 0; j <= 4; j++) {
				Random rand = new Random();
				int m = rand.nextInt(100);// 生成0-100内的随机数
				score[i][j] = m;
				System.out.print(score[i][j] + "\t" + "\t");
			}
			System.out.println(score[i]);

		}
		// for (int it = 0; it < score.length; it++) {
		// int s[];
		// s[it] = score[0][it];
		// System.out.println(s);
		// }

		int sum[] = new int[20];
		for (int m = 0; m <= 19; m++) {
			for (int l = 0; l <= 4; l++) {

				sum[m] += score[m][l];
			}
			System.out.print("第"+(m+1)+"位学员总成绩为");
			System.out.println(sum[m]);
		}
		int ave[] = new int[5];
		for (int j = 0; j <= 4; j++) {
			for (int i = 0; i <= 19; i++) {
				sum[j] += score[i][j];
			}
			ave[j] = sum[j] % 20;
			System.out.print("第"+(j+1)+"科平均分为：");

			System.out.println(ave[j]);
		}
	}
}