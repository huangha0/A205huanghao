package hfut.hao;

public class Person {
    String name;
    int age;
    String address;
    //自我介绍
	void introduce(){
		System.out.println("大家好，。我叫"+name+"，今年"+age+"岁了，我在"+address);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Person per=new Person();
    	per.name="小胖";
    	per.age=30;
    	per.address ="苏州";
    	per.introduce();		
    	
    	
    }	
}


