package prob04;

public class Depart extends Employee {
	private String depart;
	public Depart(String name,int salary,String depart) {
		super(name,salary);
		this.depart = depart;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart=depart;
	}
	@Override
	public void getInformation() {
		System.out.printf("이름: %s   연봉: %d		부서: %s\n", getName(), getSalary(),getDepart());
	}
	
}
