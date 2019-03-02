package hw01;

public class UserVO {
	
	private String name;
	private String sex;
	private String year;
	private String birthMonth;
	private String birthDay;
	private String occupation;
	private String firstNumberM;
	private String middleNumberM;
	private String lastNumberM;
	private boolean active;
	
	public UserVO() {
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public String getYear() {
		return year;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public String getOccupation() {
		return occupation;
	}

	public String getFirstNumberM() {
		return firstNumberM;
	}

	public String getMiddleNumberM() {
		return middleNumberM;
	}

	public String getLastNumberM() {
		return lastNumberM;
	}

	public boolean isActive() {
		return active;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void setFirstNumberM(String firstNumberM) {
		this.firstNumberM = firstNumberM;
	}

	public void setMiddleNumberM(String middleNumberM) {
		this.middleNumberM = middleNumberM;
	}

	public void setLastNumberM(String lastNumberM) {
		this.lastNumberM = lastNumberM;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "UserVO [name=" + name + ", sex=" + sex + ", year=" + year + ", birthMonth=" + birthMonth + ", birthDay="
				+ birthDay + ", occupation=" + occupation + ", firstNumberM=" + firstNumberM + ", middleNumberM="
				+ middleNumberM + ", lastNumberM=" + lastNumberM + ", active=" + active + "]";
	}
	

}
