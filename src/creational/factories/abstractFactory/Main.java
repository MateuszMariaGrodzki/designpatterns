package creational.factories.abstractFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>() {
            {
                add(new Student("Mateusz", new HighMathStudent()));
                add(new Student("Marcin", new HighChemStudent()));
                add(new Student("Michal", new HighPhysStudent()));
                add(new Student("Ania", new MiddleMathStudent()));
                add(new Student("Kasia", new MiddleChemStudent()));
                add(new Student("Magda", new MiddlePhysStudent()));
                add(new Student("Mateusz", new MiddleMathStudent()));
                add(new Student("Lukasz", new MiddleChemStudent()));
                add(new Student("Basia", new MiddlePhysStudent()));
            }
        };
        students.stream().forEach(Student::introduceStudent);
    }
}
