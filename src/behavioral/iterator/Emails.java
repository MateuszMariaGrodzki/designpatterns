package behavioral.iterator;

public class Emails {
    public String[] email = {
            "aaa@gmail.com",
            "bbb@gmail.com",
            "ccc@gmail.com",
            "ddd@gmail.com",
            "eee@gmail.com"
    };

    public Iterator getIterator(){
        return new EmailsIterator();
    }

    public Iterator getBackwardsIterator(){
        return new BackwardsEmailsIterator();
    }

    private class EmailsIterator implements Iterator {
        int index =0;

        @Override
        public boolean hasNext() {
            return index < email.length;
        }

        @Override
        public Object next() {
            Object object = email[index];
            index++;
            return object;
        }
    }

    private class BackwardsEmailsIterator implements Iterator {
        int index = email.length;

        @Override
        public boolean hasNext() {
            return index != 0;
        }

        @Override
        public Object next() {
            index--;
            return email[index];
        }
    }

}
