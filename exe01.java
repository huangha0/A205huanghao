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
		// ����һ��20*5�Ķ�ά���飬�����洢ĳ�༶20λѧԱ��5�ſεĳɼ���
		// ��5�ſΰ��洢˳������Ϊ��core C++��coreJava��Servlet��JSP��EJB��
		// (1)ѭ������ά�����ÿһ��Ԫ�ظ�0~100֮������������
		// (2)�����б�ķ�ʽ�����ЩѧԱ��ÿ�ſγ̵ĳɼ���
		// ��3��Ҫ���д������ÿ��ѧԱ���ܷ֣����䱣��������һ��һά�����С�
		// ��4��Ҫ���д����������ѧԱ��ĳ�ſγ̵�ƽ���֡�
		int score[][] = new int[20][5];
		System.out.println("core C++" + "\t" + "coreJava" + "\t" + "Servlet"
				+ "\t" + "\t" + "JSP" + "\t" + "\t" + "EJB");
		for (int i = 0; i <= 19; i++) {
			for (int j = 0; j <= 4; j++) {
				Random rand = new Random();
				int m = rand.nextInt(100);// ����0-100�ڵ������
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
			System.out.print("��"+(m+1)+"λѧԱ�ܳɼ�Ϊ");
			System.out.println(sum[m]);
		}
		int ave[] = new int[5];
		for (int j = 0; j <= 4; j++) {
			for (int i = 0; i <= 19; i++) {
				sum[j] += score[i][j];
			}
			ave[j] = sum[j] % 20;
			System.out.print("��"+(j+1)+"��ƽ����Ϊ��");

			System.out.println(ave[j]);
		}
	}
}