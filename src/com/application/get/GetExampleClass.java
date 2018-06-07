package com.application.get;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.application.pojo.Person;

@Path("/getExample")
public class GetExampleClass 
{
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getValue")
	public Person getValue()
	{
		Person person=new Person();
			person.setName("Furkan");
			person.setSurname("KOC");
			person.setCity("Istanbul");
			person.setCounry("Turkiye");
		return person;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getListValue")
	public List<Person> getListValue()
	{	
		List<Person>personList=new ArrayList<>();
		Person person=new Person();
			person.setName("Furkan");
			person.setSurname("KOC");
			person.setCity("Istanbul");
			person.setCounry("Turkiye");
		Person person1=new Person();
			person1.setName("Osman");
			person1.setSurname("KORUCU");
			person1.setCity("Erzurum");
			person1.setCounry("Turkiye");
		personList.add(person);
		personList.add(person1);
		return personList;
	}
}
