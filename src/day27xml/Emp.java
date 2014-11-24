package day27xml;

public class Emp implements Comparable<Emp>{
	String name;
	int age;
	String gender;
	int salary;
	
	public Emp() {
	}
	
	Emp(String name, int age, String gender, int salary){
		this.name = name;
		this.age =age;
		this.gender = gender;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "name:"+name+", age:"+age+", gender:"+gender+", salary:"+salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj instanceof Emp){
			Emp emp = (Emp)obj;
			return emp.name.equals(this.name);
		}
		return false;
	}

	@Override
	public int compareTo(Emp o) {
		return (int)(this.salary-o.salary);
	}

}
