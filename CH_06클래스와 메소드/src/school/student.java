package school;

public class student {

	private String name;
	private int age;
	private boolean isVisble; //출석, 결석
	private double temperture; //온도검사
	
	public student(String name, int age, boolean isVisble, double temperture) {
				this.name = name;
		this.age = age;
		this.isVisble = isVisble;
		this.temperture = temperture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getIsVisble() {
		return isVisble;
	}

	public void setIsVisble(boolean isVisble) {
		this.isVisble = isVisble;
	}

	public double getTemperture() {
		return temperture;
	}

	public void setTemperture(double temperture) {
		this.temperture = temperture;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", isVisble=" + isVisble + ", temperture=" + temperture + "]";
	}




}
