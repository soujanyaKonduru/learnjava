import java.util.ArrayList;

class Person{
			String name;
			
			//Constructor
			
			Person(String name){
				
				this.name = name;
				
			}
			
		}



public class GenericArrayWithClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Person> persons = new ArrayList<Person>();
	    Person p1 = new Person("soujanya");
	    persons.add(p1);        // adding person to the list

	    Person p2 = new Person("konduru");
	    persons.add(p2);        // adding person to the list

	    // print all persons
	    for(int i=0; i<persons.size(); i++){
	        Person p = persons.get(i);
	        System.out.println(p.name);
	    }

	    System.out.println("______________________");

	    // another way is
	    for(Person p: persons){
	        System.out.println(p.name);
	    }
		
	}

}
