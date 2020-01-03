package creational.factories.abstractFactory;

public class MiddleSchool implements School {
    @Override
    public void levelOfEducation() {
        System.out.println("Szkoła średnia");
    }
}
