import Service.PersonService;
import entity.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static PersonService personService;
    public static void main(String[] args) {
        Person person = personService.createPerson("K","Max","Java",1);
        List<Person> personList = personService.getAllPersons();
        personService.printPersonList(personList);
    }
}