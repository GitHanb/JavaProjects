package problemDomain;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Henry");
		nameList.add("Felix");
		nameList.add("Andrew");
		
		System.out.println("The ArrayList has " + nameList.size() + " objects stored in it.");
		
		/*
		 * for(int i=0; i<nameList.size(); i++) { System.out.println(nameList.get(i)); }
		 */
		
		for(String name: nameList) {
			System.out.println(name);
		}

	}

}
