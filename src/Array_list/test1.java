package Array_list;
import java.util.*;
public class test1 {

	
	public static void main(String []args) {
		ArrayList<Integer> list= new ArrayList<>();
		
		
		
		list.add(20);
		list.add(52);
		list.add(0);
		
		list.remove(1);
		list.set(2,20);
		
		System.out.println(list);
		System.err.println("-------------------------------------");
		System.out.println(list.get(1));
		System.out.println("-------------------------------------");

		System.out.println(list.size());
		
		System.err.println("-------------------------------------");
            
        		
        		System.out.println(list.contains(100));
        		System.out.println(list.contains(0));

            }
	}


