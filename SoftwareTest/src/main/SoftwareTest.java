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
		int jumpval = (int) Math.floor(Math.random() * 11);
		int currIndex = startIndex;
		for(int i = 0; i < 11; i++) {
			sb.append("NOAH SPECTO".charAt(currIndex));
			currIndex = (currIndex + jumpval)%11;
		}
		return sb.toString();
	}
	
}
