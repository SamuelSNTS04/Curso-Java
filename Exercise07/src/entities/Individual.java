package entities;

public class Individual extends TaxPayer {

	private Double healthcareExpenses;

	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthcareExpenses) {
		super(name, annualIncome);
		this.healthcareExpenses = healthcareExpenses;
	}

	public Double getHealthcareExpenses() {
		return healthcareExpenses;
	}

	public void setHealthcareExpenses(Double healthcareExpenses) {
		this.healthcareExpenses = healthcareExpenses;
	}

	@Override
	public Double tax() {
		if (getAnnualIncome() < 20000) {
			return getAnnualIncome() * 0.15 - healthcareExpenses * 0.5;
		}else {
			return getAnnualIncome() * 0.25 - healthcareExpenses * 0.5;
		}	
	}
}
