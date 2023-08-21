import java.util.ListIterator;
public class Mainn {
	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		  al.add("Jan");  
		  al.add("Feb");  
		  al.add("March");  
		  al.add("April");  
		  al.add(4, "May");
		  al.remove(0);
		  al.remove("April");
		  System.out.println( al.size()); 
		  System.out.println( al.get(2)); 
		  System.out.println( al.indexOf("Jan")); 
		  al.contains(al);
		  System.out.println( al.contains(al)); 
		  
		  String str = al.toString();
		  System.out.println( "IN STRING FORMAT:" + str); 
		  System.out.println( "IN ARRAY FORMAT:" + al.toArray()); 
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		   
		  }  
		 }  
		
	}

