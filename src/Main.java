import LogicClasses.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("W","W","W",00001);
            ArrayList<Person> list = new ArrayList<>();
            list.add(new Person("K","Max","JavaDeveloper",78736));
            list.add(new Person("","I","Hr-Manager",12345));
            list.add(new Person("FirstPerson","","Trainer",98765));
            list.add(new Person("MiddlePerson","Person","Unit",000));
            list.add(new Person("LastPerson","Ion","",34986));

            for (Person index : list){
                index.getPerson();
            }
        }catch (Exception e){
            System.out.println("Exception Error");
        }
    }
}