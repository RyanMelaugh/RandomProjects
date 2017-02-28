package housingCosts;

public class job {
	
	private String name;
	private int avgSalary;
	
	/**
	 * Very low:0
	 * low:1
	 * Medium:2
	 * high:3
	 * very high:4
	 */
	private int skillLvl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAvgSalary() {
		return avgSalary;
	}

	public void setAvgSalary(int avgSalary) {
		this.avgSalary = avgSalary;
	}

	public int getSkillLvl() {
		return skillLvl;
	}

	public void setSkillLvl(int skillLvl) {
		this.skillLvl = skillLvl;
	}
	
	

}
