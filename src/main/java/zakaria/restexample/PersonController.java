package zakaria.restexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	@RequestMapping(method= RequestMethod.GET)
	public @ResponseBody Person getPersons(){
		Person person = new Person();
		person.setFirstname("some first name");
		person.setLastName("some lastname");
		person.setAge(26);
		person.setDepartement("Accounting");
		
		return person;
	}

}
