package creational.factories.abstractFactory;

import creational.factories.Chemistry;
import creational.factories.Subject;

public class MiddleChemStudent implements StudentFactory {
    @Override
    public School createSchool() {
        return new MiddleSchool();
    }

    @Override
    public Subject createSubject() {
        return new Chemistry();
    }
}
