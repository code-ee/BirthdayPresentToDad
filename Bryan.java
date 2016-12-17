import java.util.ArrayList;

public class Bryan extends BeautifulPerson {
	protected static final int LOVE = Integer.MAX_VALUE;
	private ArrayList<BeautifulPerson> children = new ArrayList<>();
	private int wizardLevel = 9001;

	public Bryan() {
		super("Bryan Franklin Patterson", 25, new Birthday(12, 17, 1954));

		BeautifulPerson benjamin = new BeautifulPerson(
			"Benjamin Bryan Patterson", 17, new Birthday(5, 15, 1989)
		);
		BeautifulPerson cody = new BeautifulPerson(
			"Cody Truman Patterson", 21, new Birthday(7, 11, 1991)
		);
		BeautifulPerson ethan = new BeautifulPerson(
			"Ethan Jack Patterson", 5, new Birthday(11, 14, 1994)
		);
		BeautifulPerson sarah = new BeautifulPerson(
			"Sarah Michelle Patterson", 23, new Birthday(9, 31, 1996)
		);

		children.add(benjamin);
		children.add(cody);
		children.add(ethan);
		children.add(sarah);
	}

	public int getLove() {
		return LOVE;
	}

	public boolean believe(Object obj) {
		return true;
	}

	public int getWizardLevel() {
		return wizardLevel;
	}

	public boolean isGreatWizard() {
		if (wizardLevel > 9000) {
			return true;
		}
		return false;
	}

	public ArrayList<BeautifulPerson> getChildren() {
		return children;
	}
}