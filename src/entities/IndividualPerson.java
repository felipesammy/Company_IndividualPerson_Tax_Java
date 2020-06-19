package entities;

public class IndividualPerson extends Person{

	private Double healthexpeditures;
	
	public IndividualPerson() {super();}

	public IndividualPerson(String name, Double anualIncome, Double healthexpeditures) {
		super(name, anualIncome);
		this.healthexpeditures = healthexpeditures;
	}
	
	public Double getHealthexpeditures() {
		return healthexpeditures;
	}

	public void setHealthexpeditures(Double healthexpeditures) {
		this.healthexpeditures = healthexpeditures;
	}

	@Override
	public Double tax() {
		if(getAnualIncome() <20000) {
			if(getHealthexpeditures() == 0.0) {
			return getAnualIncome()*0.15;
			}
			else {
				return getAnualIncome()*0.15 - getHealthexpeditures()*0.50;
			}
		}
		else {
			if(getHealthexpeditures() == 0.0) {
			return getAnualIncome()*0.25;
			}
			else {
				return getAnualIncome()*0.25 - getHealthexpeditures()*0.50;
			}
		}
	}

}
