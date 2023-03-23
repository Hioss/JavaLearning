第一题：练习今日的代码

第二题：分析以下需求并实现
	1.以下代码是否会有问题？为什么？
		public class Test {
			public static void main(String[] args) {
				int i1 = 5;
				byte b1 = 4;
				int sum = i1+ b1;
				System.out.println(sum);
			}
		}

第三题：分析以下需求并实现
	1.以下代码是否会有问题？为什么？
		public class Test {
			public static void main(String[] args) {
				int i1 = 5;
				byte b1 = 4;
				byte sum = i1+ b1;
				System.out.println(sum);
			}
		}

第四题：分析以下需求并实现
	1.以下代码是否会有问题？为什么？
		public class Test {
			public static void main(String[] args) {
				byte b1 = 5;
				byte sum = b1 + 5;
				System.out.println(sum);
			}
		}

第五题：分析以下需求并实现
	1.查看以下代码，并写出结果
		public class Test {
			public static void main(String[] args) {
				int i1 = 5;
				boolean result = (i1++ > 5) && (++i1 > 4);
				System.out.println(result);
				System.out.println(i1);
			}
		}

第六题：分析以下需求并实现
	1.查看以下代码，并写出结果
		public class Test {
			public static void main(String[] args) {
				int i1 = 5;
				boolean result = (i1++ > 5) || (++i1 > 4);
				System.out.println(result);
				System.out.println(i1);
			}
		}

第七题：分析以下需求并实现
	1.请使用三元运算符计算出两个整数中的最大值。
		例如：20 40     打印结果：40是最大值

第八题：分析以下需求并实现
	1.请使用三元运算符计算出三个整数中的最大值。
		例如：20 40 30     打印结果：40是最大值

第九题：分析以下需求并实现
	1.定义一个方法，方法名为：show()
	2.在show()方法中输出以下几句话：
		我爱黑马
		我爱java
		我要好好学习
	3.在主方法中调用show()方法并运行，输出内容

第十题：分析以下需求并实现
	1.定义一个方法，方法名为：show()
	2.在show()方法中输出以下几句话：
		我爱黑马
		我爱java
		我要好好学习
	3.再定义一个方法，方法名为：print()
	4.在print()方法中调用show()方法
	5.在主方法中调用print()方法并运行，输出内容