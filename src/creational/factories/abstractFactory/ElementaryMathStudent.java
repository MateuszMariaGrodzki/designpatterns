package creational.factories.abstractFactory;

import creational.factories.Mathematics;
import creational.factories.Subject;

public class ElementaryMathStudent implements StudentFactory {
    @Override
    public School createSchool() {
        return new ElementarySchool();
    }

    @Override
    public Subject createSubject() {
        return new Mathematics();
    }
}
