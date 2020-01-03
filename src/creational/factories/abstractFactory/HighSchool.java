package creational.factories.abstractFactory;

public class HighSchool implements School {
    @Override
    public void levelOfEducation() {
        System.out.println("Szkoła wyższa");
    }
}
