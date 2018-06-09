package main;

public class NoahSpector extends SoftwareMember{

	public NoahSpector(String namein) {
		super(namein);
	}

	@Override
	public String saySomething() {
		double randBound = 4 + Math.ceil(Math.random() * 12);
		double randNum = Math.ceil(Math.random() * randBound);
		if(randNum == 11) return "11 is the best number that has existed.";
		return "Hi I am " + getName() + " and here is a random number between 1 and a random number between 5 and 16, 11 being the best: " + randNum;
		//This is a comment added by not nlspector
	}
	
}
