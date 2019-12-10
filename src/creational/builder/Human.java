package creational.builder;

public class Human {
    private String name;
    private String surname;
    private String pesel;
    private String email;
    private Integer height;
    private Integer weight;
    private String adres;
    private String eyeColor;
    private String hairColor;

    private Human(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.pesel = builder.pesel;
        this.email = builder.email;
        this.height = builder.height;
        this.weight = builder.weight;
        this.adres = builder.adres;
        this.eyeColor = builder.eyeColor;
        this.hairColor = builder.hairColor;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public String getEmail() {
        return email;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getAdress() {
        return adres;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public static class Builder{
        private String name;
        private String surname;
        private String pesel;
        private String email;
        private Integer height;
        private Integer weight;
        private String adres;
        private String eyeColor;
        private String hairColor;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public Builder pesel(String pesel){
            this.pesel = pesel;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder height(Integer height){
            this.height = height;
            return this;
        }

        public Builder weight(Integer weight){
            this.weight = weight;
            return this;
        }

        public Builder adres(String adres){
            this.adres = adres;
            return this;
        }

        public Builder eyeColor(String eyeColor){
            this.eyeColor = eyeColor;
            return this;
        }

        public Builder hairColor(String hairColor){
            this.hairColor = hairColor;
            return this;
        }

        public Human build(){
            return new Human(this);
        }
    }
}
