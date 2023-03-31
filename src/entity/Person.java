package entity;

import Exceptions.IdException;
import Exceptions.NameException;
import Exceptions.SpecificationException;

public class Person {
    private String firstName;
    private String lastName;
    private String specification;
    private int id;
    public Person(String firstName, String lastName, String specification, int id){
            if(!firstName.equals("") || !lastName.equals("")){
                this.firstName = firstName;
                this.lastName = lastName;
            }else{
                throw new NameException("NameException");
            }


            if (specification != null || !specification.equals("")){
                this.specification = specification;
            }else {
                throw new SpecificationException("SpecificationException");
            }


            if(id != 0){
                this.id = id;

            }else{
                throw new IdException("IdException");
            }

    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + specification + " " + id;
    }

}
