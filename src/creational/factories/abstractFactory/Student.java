package creational.factories.abstractFactory;

import creational.factories.Subject;

public class Student {
    String name;
    School school;
    Subject subject;

    public Student(String name , StudentFactory studentFactory){
        this.name = name;
        school = studentFactory.createSchool();
        subject = studentFactory.createSubject();
    }

    public void introduceStudent(){
        System.out.println("Imie studenta: " + name);
        school.levelOfEducation();
        subject.introduce();
    }
}
