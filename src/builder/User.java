package builder;

public class User {
    private final String name;
    private final String surname;
    private final String email;
    private final String country;
    private final String city;
    private final int age;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.surname = userBuilder.surname;
        this.email = userBuilder.email;
        this.age = userBuilder.age;
        this.country = userBuilder.country;
        this.city = userBuilder.city;
    }

    @Override
    public String toString() {
        return "builder.User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }


    public static class UserBuilder {
        private String name;
        private String surname;
        private String email;
        private String country;
        private String city;
        private int age;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder country(String country){
            this.country = country;
            return this;
        }

        public UserBuilder city(String city){
            this.city=city;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}