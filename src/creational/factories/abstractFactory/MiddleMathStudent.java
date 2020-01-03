package creational.factories.abstractFactory;

import creational.factories.Mathematics;
import creational.factories.Subject;

public class MiddleMathStudent implements StudentFactory {
    @Override
    public School createSchool() {
        return new MiddleSchool();
    }

    @Override
    public Subject createSubject() {
        return new Mathematics();
    }
}
