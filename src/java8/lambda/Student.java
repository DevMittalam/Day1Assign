package collections.framework;

public class Student {
   private String name;
   @Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", collage_name=" + collage_name + "]";
}
public Student(String name, int id, String collage_name) {
	super();
	this.name = name;
	this.id = id;
	this.collage_name = collage_name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCollage_name() {
	return collage_name;
}
public void setCollage_name(String collage_name) {
	this.collage_name = collage_name;
}
private int id;
   private String collage_name;
   
}
