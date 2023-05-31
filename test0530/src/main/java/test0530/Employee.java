package test0530;

import java.util.Date;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee {
	@NotEmpty(message="사번을 입력하세요.")
	private String empno;
	@NotEmpty(message="이름을 입력하세요.")
	private String name;
	@NotEmpty(message="주소1을 입력하세요.")
	private String addr1;
	@NotEmpty(message="주소2를 입력하세요.")
	private String addr2;
	@NotEmpty(message="우편번호를 입력하세요.")
	@Size(min=5,max=7,message="우편번호는 5자리 이상 7자리 이하만 가능합니다.")
	private String zipcode;
    @DecimalMin(value="1980",message="연도는 1980년도 이후부터 가능합니다.")
	private int birthyear;
	@NotNull(message="팀번호를 입력하세요") 
	private Long teamno;
	@NotNull(message="입사일을 입력하세요.")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Past
	private Date hiredate;
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public Long getTeamno() {
		return teamno;
	}
	public void setTeamno(Long teamno) {
		this.teamno = teamno;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

}
