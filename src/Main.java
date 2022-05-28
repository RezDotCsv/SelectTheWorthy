import java.util.HashSet;
import java.util.Set;

public class Main {

	static DataBase d = new DataBase();
	static Person one = new Person("Joe","Momma","101  Big Small Street", "Can breathe with mouth open");
	static Person two = new Person("Alli","Bannana","301 Small Big Street", "Can carry 0.2x my weight");
	static Person three = new Person("Molly","Ranna","208 Walmart Dr. ", "I exist with minimal air");

	public static void main(String[] args) {
	
		
		d.addPersonToBeConsidered(one);
		d.addPersonToBeConsidered(one);
		d.addPersonToBeConsidered(two);
		d.addPersonToBeConsidered(three);
		
		
		System.out.println(d.consider());
		d.accept();
		d.accept();
		d.reject();
		d.accept();
		
		System.out.println(d.searchForPerson("Joe"));
		System.out.println(d.getAllAccptedPeople());
		
	}
	
}
