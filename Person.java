import java.util.Calendar;

public class Person {
	private String name;
	private int ageAtHeart;
	private Birthday birthday;

	public Person() {
		// default constructor
	}

	public Person(String n, int a, Birthday b) {
		name = n;
		ageAtHeart = a;
		birthday = b;
	}

	public String getName() {
		return new String(name);
	}

	public int getAgeAtHeart() {
		return ageAtHeart;
	}

	public int getPhysicalAge() {
		Calendar c = Calendar.getInstance();
		
		int month = c.get(Calendar.MONTH + 1);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int year = c.get(Calendar.YEAR);

		int age = year - birthday.getYear();
		if (month < birthday.getMonth()) {
			if (day < birthday.getDay()) {
				age--;
			}
		}
		return age;
	}

	public Birthday getBirthday() {
		return new Birthday(birthday);
	}

	public void setName(String n) {
		name = n;
	}

	public void setAgeAtHeart(int a) {
		ageAtHeart = a;
	}

	public void setBirthday(Birthday b) {
		birthday = b;
	}

	public String toString() {
		return (
			"\nName: " + getName() + "\n" + 
			"Birthday: " + getBirthday().toString() + "\n" +
			"Physical age: " + getPhysicalAge() + "\n" + 
			"Age at heart: " + getAgeAtHeart() + "\n"
		);
	}
}