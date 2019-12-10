package creational.builder;

public class Main {

    public static void main(String[] args) {
        Human human = new Human.Builder()
                .email("aaa@gmail.com")
                .adres("Warszawa")
                .eyeColor("black")
                .hairColor("blonde")
                .height(180)
                .name("Krzysztof")
                .pesel("1234567914")
                .surname("Kowalski")
                .weight(170).build();
    }
}
