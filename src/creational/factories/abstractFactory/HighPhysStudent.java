package creational.factories.abstractFactory;

import creational.factories.Physics;
import creational.factories.Subject;

public class HighPhysStudent implements StudentFactory {
    @Override
    public School createSchool() {
        return new HighSchool();
    }

    @Override
    public Subject createSubject() {
        return new Physics();
    }
}
