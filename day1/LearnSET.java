package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Set<String> customer=new HashSet<String>();
		
		customer.add("Tom");
		customer.add("Jerry");
		customer.add("Tom");
		customer.add("Disney");
		customer.add("disney");
		System.out.println("Customer name as per HashSet: "+customer);
		
		//for each - collection program
		
		//for(int i=0; i<mentor.size(); i++)
		//int i(initial value) - Integer
		//string name (condition) - customer
		//for ctrl+space then the fourth(4) value
		for (String name : customer) {
			System.out.println(name);
		}
		
		//convert set into list
		//if you want to get one infor or data convert set into list
		List<String> data= new ArrayList<String>(customer);
		System.out.println(data);
		
		//data.get(4);
		//ctrl+2 then assign to local variable
		String string = data.get(3);
		System.out.println(string);
		
       Set<String> customer2=new TreeSet<String>();
		
		customer2.add("Tom");
		customer2.add("Jerry");
		customer2.add("Tom");
		customer2.add("Disney");
		customer2.add("disney");
		System.out.println("Customer name as per TreeSet: "+customer2);
		
		Set<String> customer3=new LinkedHashSet<String>();
		
		customer3.add("Tom");
		customer3.add("Jerry");
		customer3.add("Tom");
		customer3.add("Disney");
		customer3.add("disney");
		System.out.println("Customer name as per LinkedHashSet: "+customer3);
	}

}
