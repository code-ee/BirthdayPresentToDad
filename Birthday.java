public class Birthday {
	private int month;
	private int day;
	private int year;

	public Birthday(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	public Birthday(Birthday b) {
		month = b.getMonth();
		day = b.getDay();
		year = b.getYear();
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int m) {
		month = m;
	}

	public void setDay(int d) {
		day = d;
	}

	public void setSear(int y) {
		year = y;
	}

	public String toString() {
		return month + "-" + day + "-" + year;
	}
}