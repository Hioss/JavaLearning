第一题：练习今日的代码

第二题：在JDK中查找
		共找出三个
			final修饰的类、被final修饰的方法、被final修饰的变量
		备注：
			不需要每种找一个。共找到三个即可。

第三题：分析以下需求，并用代码实现
	interface Inter {
		void show(); 
	}
	class Outer { 
		//补齐代码 
	}
	public class OuterDemo {
		public static void main(String[] args) {
			  Outer.method().show();
		  }
	}
	要求在控制台输出”HelloWorld”	


	
第四题：分析以下需求，并用代码实现

	要求:在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现 
	
	public class Test {
		public static void main(String[] args) {		
		}
	}
	//定义接口
	interface InterA {
		void showA();	
	}
	class A {
		public void methodA(InterA a) {
			a.showA();		
		}	
	}