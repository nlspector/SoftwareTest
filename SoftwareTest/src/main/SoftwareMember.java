package main;

public abstract class SoftwareMember {
	private String name;
	public SoftwareMember(String namein) {
		name=namein;
	}
	public abstract String saySomething();
	
	public String getName() {
		return name;
	}
	public void setName(String in) {
		name = in;
	}
}
