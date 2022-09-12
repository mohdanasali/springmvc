package springmvcsearch.model;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {

	public String yourname;
	public Long yourid;
	public List<String> courses;
	public String gender;
	@DateTimeFormat(pattern="dd/mm/yy") 
	Date dob;
	public String getYourname() {
		return yourname;
	}
	public void setYourname(String yourname) {
		this.yourname = yourname;
	}
	public Long getYourid() {
		return yourid;
	}
	public void setYourid(Long yourid) {
		this.yourid = yourid;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [yourname=" + yourname + ", yourid=" + yourid + ", courses=" + courses + ", gender=" + gender
				+ ", dob=" + dob + "]";
	}
	
}
