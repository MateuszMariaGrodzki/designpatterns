package creational.factories.abstractFactory;

import creational.factories.Physics;
import creational.factories.Subject;

public class MiddlePhysStudent implements StudentFactory {
    @Override
    public School createSchool() {
        return new MiddleSchool();
    }

    @Override
    public Subject createSubject() {
        return new Physics();
    }
}
