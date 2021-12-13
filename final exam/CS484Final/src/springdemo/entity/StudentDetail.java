package springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_detail")
public class StudentDetail
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="st_detail_id")
	private int detailId;
	@Column(name="st_punch_line")
	private String punchline;
	@Column(name="st_hobby")
	private String hobby;

	public StudentDetail() {};
	
	public StudentDetail(String punchline, String hobby)
	{
		this.punchline = punchline;
		this.hobby = hobby;
	}

	public int getDetailId()
	{
		return detailId;
	}

	public void setDetailId(int detailId)
	{
		this.detailId = detailId;
	}

	public String getPunchline()
	{
		return punchline;
	}

	public void setPunchline(String punchline)
	{
		this.punchline = punchline;
	}

	public String getHobby()
	{
		return hobby;
	}

	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}

	@Override
	public String toString()
	{
		return "StudentDetail [detailId=" + detailId + ", punchline=" + punchline + ", hobby=" + hobby + "]";
	}
	
	
}
