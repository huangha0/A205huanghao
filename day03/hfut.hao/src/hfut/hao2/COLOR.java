package hfut.hao2;
public class COLOR {

	 public void methodp1(){
		 	System.out.println("public methodp1");
		 }
		 //私有方法
		 private void methodp2(){
		 	System.out.println("private methodp2");
		 }//default范围的方法（同一个包可以访问）
		  void method3a(){
		 	 System.out.println("default methodp3"); 
		  }
//protected (同一类)

		//公共访问修饰的特殊方法
	   public static void main(String[] args) {
		  COLOR c1=new COLOR();
		  c1.methodp1();
	  
		  
	   }
		
	}
	
     
     
	 
 
