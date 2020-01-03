package creational.factories.abstractFactory;

public class ElementarySchool implements School {
    @Override
    public void levelOfEducation() {
        System.out.println("Szkoła podstawowa");
    }
}
