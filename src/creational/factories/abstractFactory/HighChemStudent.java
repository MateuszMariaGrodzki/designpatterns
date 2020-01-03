package creational.factories.abstractFactory;

import creational.factories.Chemistry;
import creational.factories.Subject;

public class HighChemStudent implements StudentFactory {
    @Override
    public School createSchool() {
        return new HighSchool();
    }

    @Override
    public Subject createSubject() {
        return new Chemistry();
    }
}
