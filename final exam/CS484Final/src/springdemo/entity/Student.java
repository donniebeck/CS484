package springdemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="st_id")
	private int studentId;
	@Column(name="st_name")
	private String studentName;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="st_detail_id")
	private StudentDetail studentDetail;
	
	public Student() {};
	
	public Student(String studentName, StudentDetail studentDetail)
	{
		this.studentName = studentName;
		this.studentDetail = studentDetail;
	}
	
	public Student(String studentName)
	{
		this.studentName = studentName;
	}

	public int getStudentId()
	{
		return studentId;
	}

	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}

	public String getStudentName()
	{
		return studentName;
	}

	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}

	public StudentDetail getStudentDetail()
	{
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail)
	{
		this.studentDetail = studentDetail;
	}

	@Override
	public String toString()
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDetail=" + studentDetail
				+ "]";
	}
	
	
}
