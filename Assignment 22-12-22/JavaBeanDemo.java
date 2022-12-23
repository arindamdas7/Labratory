package oops;

class College
{
	private int collegeId;
	private String collegeName;
	
	
	//no-args constructor
	public College()
	{
		super();
		
	}
	//parameterized constructor
	public College(int collegeId, String collegeName)
	{
		this.collegeId=collegeId;
		this.collegeName=collegeName;
	}
	//setter
	public void setCollegeId(int collegeId)
	{
		this.collegeId=collegeId;
	}
	//getter
	public int getCollegeId()
	{
		return collegeId;
	}
	public void setCollegeName(String collegeName)
	{
		this.collegeName=collegeName;
		
	}
	public String getCollegeName()
	{
		return collegeName;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + "]";
	}
	
}
public class JavaBeanDemo 
{
	public static void main(String[] agrs)
	{
		College college1 = new College();
		college1.setCollegeId(101);
		college1.setCollegeName("MAKAUT");
		System.out.println(college1);
		System.out.println("College Name: "+college1.getCollegeName());
		System.out.println("College ID: "+college1.getCollegeId());
	}
}
