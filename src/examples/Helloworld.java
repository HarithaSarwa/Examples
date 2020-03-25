package examples;

public class Helloworld{

	public static void main(String[] args){
		
		System.out.println("Hello World");
		
		variables obj =new variables();
		obj.method();
		System.out.println("Instance Variable: "+obj.data1);
		System.out.println(variables.m);
		
	}
	
}
