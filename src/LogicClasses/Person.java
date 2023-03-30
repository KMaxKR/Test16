package LogicClasses;

import Exceptions.IdException;
import Exceptions.NameException;
import Exceptions.SpecificationException;

public class Person {
    private String firstName;
    private String lastName;
    private String specification;
    private int id;
    private String invalidId = "IdException";
    public Person(String firstName, String lastName, String specification, int id){
        try {
            if(firstName.equals("") || lastName.equals("")){
                throw new NameException("NameException");
            }else{
                this.firstName = firstName;
                this.lastName = lastName;
            }
        }catch (NameException e){
            this.firstName = "FirstNameException";
            this.lastName = "LastNameException";
        }



        try {
            if (specification == null || specification.equals("")){
                throw new SpecificationException("SpecificationException");
            }else {
                this.specification = specification;
            }
        }catch (SpecificationException e){
            this.specification = "SpecificationException";
        }


        try {
            if(id == 0 || id <= 5 && id > 5){
            throw new IdException("IdException");
            }else{
                this.id = id;
            }
        }catch (IdException e){
            this.id = 0;
        }

    }

    public void getPerson(){
        System.out.println(firstName + " " + lastName + " " + specification + " " + id);
    }
}
