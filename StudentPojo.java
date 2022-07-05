package org.mini.console.task;

public class StudentPojo {
	private String name;
	private int id;
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

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id ;
	}
	public StudentPojo(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	

}
