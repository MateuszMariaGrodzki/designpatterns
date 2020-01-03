package creational.factories.abstractFactory;

import creational.factories.Mathematics;
import creational.factories.Subject;

public class HighMathStudent implements  StudentFactory {
    @Override
    public School createSchool() {
        return new HighSchool();
    }

    @Override
    public Subject createSubject() {
        return new Mathematics();
    }
}
