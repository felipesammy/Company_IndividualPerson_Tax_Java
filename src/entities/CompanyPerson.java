package entities;

public class CompanyPerson extends Person{

	private Integer numberOfEmployees;
	
	public CompanyPerson() {super();}
	
	public CompanyPerson(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if(getNumberOfEmployees() <10) {
			return getAnualIncome()*0.16; 
		}
		else {
			return getAnualIncome()*0.14;
		}
	}

}
