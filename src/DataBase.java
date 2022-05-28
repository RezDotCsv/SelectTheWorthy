
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;


public class DataBase {
	
	private Queue<Person> peopleToBeConsidered = new LinkedList<Person>();
	private Set<Person> peopleAccepted = new TreeSet<Person>();
	private Set<Person> peopleRejected = new TreeSet<Person>();
	
	
	
	public void addPersonToBeConsidered(Person p) {
		
		peopleToBeConsidered.add(p);
		
	}

	public String consider() {
		
		if(peopleToBeConsidered.peek()==null) {
			return "No more people to consider";
		}
		
		if(peopleAccepted.contains(peopleToBeConsidered.peek())||peopleRejected.contains(peopleToBeConsidered.peek())) {
			
			return peopleToBeConsidered.poll().getFirstName() + " has already been processed";
		}
		
		return peopleToBeConsidered.peek().getApplication();
		
		
	}
	public void accept() {
		if(peopleToBeConsidered.peek()!=null) {
			peopleAccepted.add(peopleToBeConsidered.poll());
		}
		
	}
	public void reject() {
		if(peopleToBeConsidered.peek()!=null) {
			peopleRejected.add(peopleToBeConsidered.poll());
		}
		
	}
	
	public String searchForPerson(String firstName) {
		
		String people = "" ;
		
		for(Person p : peopleAccepted) {
			if(p.getFirstName().equals(firstName)) {
				people.join("\n", p.toString());
			}
		}
		
		if(people.length()==0) {
			return "No person with first name: "+ firstName; 
		}
		
		return "The Following people have first names of " + firstName + people;
		
		
		
		
	}
	
	public String getAllAccptedPeople() {
		String result = "";
		
		for(Person p: peopleAccepted) {
			result.join("\n",  p.toString());
		}
		
		return result;
	}
	
	
	
}
