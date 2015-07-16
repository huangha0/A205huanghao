import java.security.PublicKey;
import java.util.Scanner;


public class day {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int day=scanner.nextInt();
		String monthString="";
		switch(day)
		{
		case 1:monthString="monday";break;
		case 2:monthString="tuesday";break;
		case 3:monthString="wedneday";break;
		default:monthString="error day";
		}
		System.out.println(monthString);
		
		
		
	

	}

}
