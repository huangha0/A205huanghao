package static”√∑®;

public class demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculator c1=new Calculator();
    Calculator c2=new Calculator();
    c1.a();
    System.out.println("num1:"+c2.num1);
    System.out.println("num2:"+c2.num2);
    System.out.println("-----------");
    System.out.println("num2:"+c1.num1);
    System.out.println("num2:"+c1.num2);
	}

}

class Calculator{
	static int num1=1;
	int num2=2;
	void a(){
		num1=9;
		num2=10;
	}
}
