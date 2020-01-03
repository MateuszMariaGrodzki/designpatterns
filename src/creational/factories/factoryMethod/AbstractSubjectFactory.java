package creational.factories.factoryMethod;

import creational.factories.Chemistry;
import creational.factories.Mathematics;
import creational.factories.Physics;
import creational.factories.Subject;

public class AbstractSubjectFactory extends AbstractSubject {

    @Override
    protected Subject createSubject(String name) {
        Subject subject;
        if(name.equals("mathematics")){
            subject = new Mathematics();
        } else if(name.equals("physics")){
            subject = new Physics();
        } else if(name.equals("chemistry")){
            subject = new Chemistry();
        } else {
            subject = null;
        }
        return subject;
    }
}
