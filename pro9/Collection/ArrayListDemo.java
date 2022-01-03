package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	       List<Cat> cats=new ArrayList<Cat>();
	
	       Cat tomcat=new Cat();
	       tomcat.setName("Tom");
	
	       Cat jackcat=new Cat();
	       jackcat.setName("Jack");
	
	       Cat johncat=new Cat();
	       johncat.setName("John");
	
	       Cat anncat=new Cat();
	       anncat.setName("Ann");

	       cats.add(tomcat); 
	       cats.add(jackcat); 
	       cats.add(johncat); 
	       cats.add(2,anncat); 

	       cats.remove(jackcat);
	

	       cats.set(0,jackcat); 
	
	       System.out.println(cats.get(0).getName());
	
	       System.out.println(cats.contains(jackcat));
	       System.out.println(cats.indexOf(jackcat));

	       Cat[] c = cats.toArray(new Cat[0]);
	       System.out.println(c[0].getName());

		   Cat[] array =new Cat[cats.size()];
		   cats.toArray(array);

		   for (int i=0;i<array.length;i++) {
			  System.out.println(array[i].getName());
		   }
	       
	       for (int i=0;i<cats.size();i++) {
		     System.out.println(cats.get(i).getName());
	       }

	       Iterator it = cats.iterator();
	       while(it.hasNext()) {
	          Cat cat = (Cat)it.next();
	          System.out.println(cat.getName());
	       }

	       for (Cat cat:cats){
		      System.out.println(cat.getName());
	       }


		
	}
}
