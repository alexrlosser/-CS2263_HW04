package edu.isu.cs2263.HW4;

import java.util.ArrayList;
import java.util.List;

public class Person implements Visitable {

    public int age;
    public String firstName;
    public String lastName;
    public List<Relationship> relationshipList;

    public Person() {}

    public Person(int ageVal, String fName, String lName) {
        age = ageVal;
        firstName = fName;
        lastName = lName;
        relationshipList = new ArrayList<Relationship>();
    }

    public int getAge() {
        return age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void addRelation(String rel, Person per) {
        Relationship newRelation = new Relationship(rel, per);
        relationshipList.add(newRelation);
    }
    public String name() {
        return (firstName + " " + lastName);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
