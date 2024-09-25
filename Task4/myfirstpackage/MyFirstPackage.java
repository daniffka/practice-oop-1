package Task4.myfirstpackage;
public class MyFirstPackage{
 	private int a;
 	private int b;

 	public int mod(){
		return 	this.a % this.b;
	}
	
	public MyFirstPackage(int a, int b){
		this.a = a;
		this.b = b;
	}

	public int getA(){
		return this.a;
	}

	public int getB(){
		return this.b;
	}

	public void setA(int a){
		this.a=a;
	}

	public void setB(int b){
		this.b=b;
	}

}