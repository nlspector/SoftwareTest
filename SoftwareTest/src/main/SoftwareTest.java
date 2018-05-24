package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SoftwareTest {

	public static void main(String[] args) {
		System.out.println("HahahHAHAHAHhAhaHAhaHaHaHaHAHahaHAhAhAHaHAhAh IT WORKS");
		List<SoftwareMember> memberList = new ArrayList<>();
		memberList.add((new NoahSpector(getNoahsName())));
		for(SoftwareMember sm : memberList) {
			System.out.println(sm.getName() + ": " + sm.saySomething());
		}
	}
	
	public static String getNoahsName() {
		StringBuilder sb = new StringBuilder();
		int startIndex = (int) Math.floor(Math.random() * 11);
		int spaceIndex = (startIndex + 5)/2;
		int jumpval = 1 + (int) Math.floor(Math.random() * 10);
		jumpval++;
		int currIndex = startIndex;
		for(int i = 0; i < 11; i++) {
			sb.append("NOAHSPECTOR".charAt(currIndex));
			currIndex = (currIndex + jumpval)%11;
			if(i == spaceIndex) sb.append(" ");
		}
		return sb.toString();
	}
	
}
