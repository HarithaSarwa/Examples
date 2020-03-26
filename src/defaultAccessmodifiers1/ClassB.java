package defaultAccessmodifiers1;
import defaultAccessmodifiers.*;

public class ClassB {

	public static void main(String args[]){  
			
		ClassA obj = new ClassA();
			   //Compile Time Error  
			  // obj.msg();
			   //Compile Time Error  Default method cannot be called in other package 
		System.out.println("Default Modifier");
			  }  

	

}

// Output  Default Modifier