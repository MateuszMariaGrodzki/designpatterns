package creational.factories.simple;

import creational.factories.Chemistry;
import creational.factories.Mathematics;
import creational.factories.Physics;
import creational.factories.Subject;

public class SimpleFactory {

    public Subject createSubject(String name){
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
