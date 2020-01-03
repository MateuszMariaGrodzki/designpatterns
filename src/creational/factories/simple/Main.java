package creational.factories.simple;

import creational.factories.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Subject math = new SimpleFactory().createSubject("mathematics");
        Subject phys = new SimpleFactory().createSubject("physics");
        Subject chem = new SimpleFactory().createSubject("chemistry");

        List<Subject> lectures = new ArrayList<>(Arrays.asList(math,phys,chem));
        lectures.stream().forEach(Subject::introduce);
    }
}
