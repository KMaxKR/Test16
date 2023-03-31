package Service;

import Exceptions.IdException;
import Exceptions.NameException;
import Exceptions.SpecificationException;
import entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public static Person createPerson(String firstName, String lastName, String specification, int id){
        Person person = null;
        try {
            person = new Person(firstName, lastName, specification, id);
        }catch (NameException e){
            System.out.println(e.getMessage());
        }catch (SpecificationException e){
            System.out.println(e.getMessage());
        }catch (IdException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return person;
    }
    public static List<Person> getAllPersons(){
        ArrayList <Person> list = null;
        try {
            list = new ArrayList<>();
            list.add(new Person("J","H","Python",2));
            list.add(new Person("E","b","PHP",7));
        }catch (NameException e){
            System.out.println(e.getMessage());
        }catch (SpecificationException e){
            System.out.println(e.getMessage());
        }catch (IdException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static void printPersonList(List<Person> personList){
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
