package data;

public class Quote {

	private String date;
	private String time;
	private String name;
	
	private String option;
	private String price;
	private String coverage;
	private String replacement;
	private String liability;
	private String personalProperty;
	private String deductible;
	
	public Quote() {
		
	}
	
	public Quote(String date, String time, String price) {
		this.date = date;
		this.time = time;
		this.price = price;
	}
	
	public Quote(String option, String price, String coverage, String replacement, String liability, String personalProperty, String deductible) {
		this.option = option;
		this.price = price;
		this.coverage = coverage;
		this.replacement = replacement;
		this.liability = liability;
		this.personalProperty = personalProperty;
		this.deductible = deductible;
	}
	
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getCoverage() {
		return coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}
	
	public String getReplacement() {
		return replacement;
	}
	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}
	
	public String getLiability() {
		return liability;
	}
	public void setLiability(String liability) {
		this.liability = liability;
	}
	
	public String getPersonalProperty() {
		return personalProperty;
	}
	public void setPersonalProperty(String personalProperty) {
		this.personalProperty = personalProperty;
	}
	
	public String getDeductible() {
		return deductible;
	}
	public void setDeductible(String deductible) {
		this.deductible = deductible;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
