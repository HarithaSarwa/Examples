package protectedModifier1;
import protectedModifiers.*;

class ClassB extends ClassA{  
		
			  public static void main(String args[]){  
			   ClassB obj = new ClassB();  
			   obj.msg(); 
			   System.out.println(" Protected Modifier");
			  }
	}


// output : Hello , Protected Modifier