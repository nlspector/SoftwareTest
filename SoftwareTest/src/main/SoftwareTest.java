package main;

import java.util.ArrayList;
import java.util.List;

public class SoftwareTest {

	public static void main(String[] args) {
		List<SoftwareMember> memberList = new ArrayList<>();
		//This is a random comment added to show branches
		//From a different computer and diff commit
		memberList.add((new NoahSpector("Pepin the Short")));
		for(SoftwareMember sm : memberList) {
			System.out.println(sm.getName() + ": " + sm.saySomething());
		}
	}
	
}
