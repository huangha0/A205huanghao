package hefei.huanghao;

public class Shape {
	public void draw(){
	System.out.println(this.getClass().getName()+"draw.");
	}
	
	class Circle {
		public void test() {
			draw();
		}
		
	}


	class Triagle extends Circle{
		public void test() {
			super.test();
		}
	}
}


