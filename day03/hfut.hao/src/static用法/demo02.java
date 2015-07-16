package static用法;

public class demo02 {
   int age;
   void hello(){
	   System.out.println("hello small pang ");
   }
	   static String name="张三";
	   static void hi(){
		   System.out.println("hi xiaopang");
		   
	   }
	   public static void main(String[] args){
		   demo02 d=new demo02();
			System.out.println(demo02.name);
			demo02.hi();
			d.hi();
		   
	   
   }
   }

