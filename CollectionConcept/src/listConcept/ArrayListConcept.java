package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
	
		Employee e1=new Employee("Abhishek", 28, "QA");
		Employee e2=new Employee("Rakesh", 29, "Dev");
		Employee e3=new Employee("Rahul", 28, "finance");
		
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		Iterator<Employee> it=ar.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
		
		
		

	}

}
