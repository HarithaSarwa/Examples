package publicModifier1;
import publicModifier.*;

public class ClassB {
	public static void main(String args[]){  
		   ClassA obj = new ClassA();  
		   obj.msg();  
		   System.out.println("Public Modifier");
		  }  
}
// output: Hello,Public Modifier