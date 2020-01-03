package creational.factories.factoryMethod;

import creational.factories.Subject;

public abstract class AbstractSubject {

    public void doSomethingWithSubject(String name){
        Subject subject = createSubject(name);
        subject.introduce();
    }

    protected abstract Subject createSubject(String name);

}
