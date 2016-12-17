public class BeautifulPerson extends Person {
	private boolean lovedStatus = true;

	public BeautifulPerson() {
		super();
	}

	public BeautifulPerson(String n, int a, Birthday b) {
		super(n, a, b);
	}

	public boolean isLoved() {
		return lovedStatus;
	}

	public void setLovedStatus(boolean ls) {
		lovedStatus = ls;
	}
}