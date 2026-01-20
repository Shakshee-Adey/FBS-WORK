package L1;

import java.util.ArrayList;

public class Person {
     
	String name;
	int age;
	
	public Person() {           //default constructor
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {     //parameterize constructor
		
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
}
class TestPerson
{
	public static void main(String args[])
	{
		ArrayList<Person> p1 =new ArrayList<>();
		p1.add(new Person("Shakshee",22));
		p1.add(new Person("Prachi",30));
		p1.add(new Person("Bharti",25));
		p1.add(new Person("Vani",27));
		
		String x = "Vani";                   //find krna h ye name
		
		Person result = linearSearch(p1,x);
		
		if(result != null)
		{
			System.out.println("Person found \n"+ result);
		}else
		{
			System.out.println("Person not found ");
		}
	}

	static Person linearSearch(ArrayList<Person> p1, String x) {
		for(Person person : p1)
		{
			if(person.getName().equalsIgnoreCase(x)) {
				return person;               //return the matching Person object
			}
		}
		return null;           //key not found
	}
}
