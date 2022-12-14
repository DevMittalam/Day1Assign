package epotral.assignment;

public class Course {
    private int course_id;
    private String name;
    private String description;
	public Course(int course_id, String name, String description) {
		super();
		this.course_id = course_id;
		this.name = name;
		this.description = description;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", name=" + name + ", description=" + description + "]";
	}
    
}
