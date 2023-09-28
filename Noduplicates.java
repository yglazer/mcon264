
import java.util.*;

public class Noduplicates{
	public static void main (String[] args) {
		ArrayList<String> presidents= new ArrayList<String>();
		presidents.add("TRUMP");
		presidents.add("TRUMP");
		presidents.add("BUSH");
		presidents.add("BIDEN");
		presidents.add("OBAMA");
		System.out.println(presidents);
		
		Set<String> noDuplicates=new HashSet <String>();
		noDuplicates.add("TRUMP");
		noDuplicates.add("TRUMP");
		noDuplicates.add("BUSH");
		noDuplicates.add("BIDEN");
		noDuplicates.add("OBAMA");
		System.out.println(noDuplicates);
		
		
	}
	}
	
