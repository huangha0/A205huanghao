package hfut.hao;

public class Person {
    String name;
    int age;
    String address;
    //���ҽ���
	void introduce(){
		System.out.println("��Һã����ҽ�"+name+"������"+age+"���ˣ�����"+address);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Person per=new Person();
    	per.name="С��";
    	per.age=30;
    	per.address ="����";
    	per.introduce();		
    	
    	
    }	
}

