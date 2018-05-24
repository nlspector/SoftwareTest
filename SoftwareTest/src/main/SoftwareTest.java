package main;

import java.util.ArrayList;
import java.util.List;

public class SoftwareTest {

	public static void main(String[] args) {
		System.out.println("HahahHAHAHAHhAhaHAhaHaHaHaHAHahaHAhAhAHaHAhAh IT WORKS");
		List<SoftwareMember> memberList = new ArrayList<>();
		memberList.add((new NoahSpector("Pepin the Short")));
		for(SoftwareMember sm : memberList) {
			System.out.println(sm.getName() + ": " + sm.saySomething());
		}
	}
	
}
