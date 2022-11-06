package kodlama.io.Devs.entities.concretes;

import kodlama.io.Devs.entities.abstracts.Entity;

public class ProgrammingLanguage implements Entity {

	private int id;
	private String programmingLanguage;
	
	
	public ProgrammingLanguage() {
		
	}
	
	public ProgrammingLanguage(int id, String programmingLanguage) {
	
		this.id = id;
		this.programmingLanguage = programmingLanguage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	
	
}
