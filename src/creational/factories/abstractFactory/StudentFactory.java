package creational.factories.abstractFactory;

import creational.factories.Subject;

public interface StudentFactory {
    School createSchool();
    Subject createSubject();
}
