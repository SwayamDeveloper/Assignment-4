import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	
      for(int i =1; i<=15; i++)
      {
    	  map.put(i, i*i);
      }
      
      System.out.println(map);
      
      System.out.println("Printing keys and values");
      
      for(Map.Entry m : map.entrySet())
      {
    	  System.out.println(m.getKey()+" : "+m.getValue());
      }
	
	
	
	}
}
