package behavioral.iterator;

public class Emails {
    public String[] email = {
            "aaa@gmail.com",
            "bbb@gmail.com",
            "ccc@gmail.com",
            "ddd@gmail.com",
            "eee@gmail.com"
    };

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
}
