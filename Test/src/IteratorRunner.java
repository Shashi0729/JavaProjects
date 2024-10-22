import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRunner {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
	Iterator<String> iterator = list.iterator();
	
list.add("Hello World");
System.out.println(iterator.hasNext());

	}

}
