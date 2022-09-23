package epotral.assignment;

public class BothDetails {
     private int stuId;
     private int CId;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getCId() {
		return CId;
	}
	public void setCId(int cId) {
		CId = cId;
	}
	public BothDetails(int stuId, int cId) {
		super();
		this.stuId = stuId;
		CId = cId;
	}
	@Override
	public String toString() {
		return "BothDetails [stuId=" + stuId + ", CId=" + CId + "]";
	}
     
} 
