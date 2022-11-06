package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class ImMemoryProgrammingLanguage implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> programmingLanguages;
	
	public ImMemoryProgrammingLanguage() {
		programmingLanguages= new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"java"));
		programmingLanguages.add(new ProgrammingLanguage(2,"python"));
		programmingLanguages.add(new ProgrammingLanguage(1,"c++"));
		programmingLanguages.add(new ProgrammingLanguage(1,"c"));
		programmingLanguages.add(new ProgrammingLanguage(1,"perl"));

	}


	@Override
	public List<ProgrammingLanguage> getAll() {
		
	 return programmingLanguages;
	}
  
}

