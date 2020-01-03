package creational.factories.abstractFactory;

import creational.factories.Physics;
import creational.factories.Subject;

public class ElementaryPhysStudent implements StudentFactory {
    @Override
    public School createSchool() {
        return new ElementarySchool();
    }

    @Override
    public Subject createSubject() {
        return new Physics();
    }
}
