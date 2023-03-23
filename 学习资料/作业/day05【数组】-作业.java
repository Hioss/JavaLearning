第一题：练习今日的代码

第二题：分析以下需求并实现
	1.看程序说结果，请不要提前运行
	public class Test03_01 {
		public static void main(String[] args) {
			int[] arr1 = {1,2,3,4,5};
			int[] temp1 = arr1;
			int[] temp2 = arr1;
			System.out.println("通过temp1取出数组值: ");
			
			for(int i = 0;i<temp1.length;i++) {
				System.out.print(temp1[i]+" ");
			}
			System.out.println();
			System.out.println("通过temp2取出数组值: ");
			for(int i = 0;i<temp2.length;i++) {
				System.out.print(temp2[i]+" ");
			}
			System.out.println();
			temp1[2] = 9;
			
			System.out.println("通过temp1取出数组值: ");
			for(int i = 0;i<temp1.length;i++) {
				System.out.print(temp1[i]+" ");
			}
			System.out.println();
			System.out.println("通过temp2取出数组值: ");
			for(int i = 0;i<temp2.length;i++) {
				System.out.print(temp2[i]+" ");
			}
			System.out.println();
			
		}
	}

第三题：分析以下需求并实现
	1.看程序说结果，请不要提前运行
	public class Test03_02 {
		public static void main(String[] args) {
			int[] arr1 = {1,2,3,4,5};
			int[] arr2 = {5,6,7};
			int[] temp = arr1;
			
			System.out.println("通过temp取出arr1中的元素: ");
			
			for(int i = 0;i<temp.length;i++) {
				System.out.print(temp[i]+" ");
			}
			
			temp = arr2;
			
			System.out.println("通过temp取出arr2中的元素: ");
			
			for(int i = 0;i<temp.length;i++) {
				System.out.print(temp[i]+" ");
			}
		}
	}

第四题：分析以下需求并实现
	1.定义一个用于存放班级分数的数组
		int[] score = {80,90,85,90,78,88,89,93,98,75};
	2.求出班级不及格人数(分数低于60分的就是不及格)
	3.求出班级的平均分
	4.求出班级的总分数