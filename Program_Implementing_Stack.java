import java.util.Stack;
import java.util.*;
class demostack {
	  public static void main(String[] args) {
	    Stack<String> animals= new Stack<String>();

	    animals.push("Dog");
	    animals.push("Horse");
	    animals.push("Cat");
	    System.out.println("Stack: " + animals);

	   
	    animals.pop();
	    System.out.println("Stack after pop: " + animals);
	    animals.peek();
	    System.out.println("Stack after peek: " + animals);
	    }
	  
	}
