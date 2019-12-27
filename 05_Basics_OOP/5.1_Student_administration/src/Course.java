public class Course {
	private String name;
	private int credit;
	private float multiplicator;
	private float grade;

	public Course(String name, int credit, float multiplier, float grade) {
		setName(name);
		setCredit(credit);
		setMultiplier(multiplier);
		setGrade(grade);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public float getMultiplier() {
		return multiplicator;
	}

	public void setMultiplier(float multiplicator) {
		this.multiplicator = multiplicator;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}
}
