package Task4;
import Task4.myfirstpackage.*;
class MyFirstClass {
	public static void main(String[] s) {
		MyFirstPackage obj = new MyFirstPackage(20,5);
		System.out.println(obj.mod());
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				obj.setA(i);
				obj.setB(j);
				System.out.print(obj.mod());
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}