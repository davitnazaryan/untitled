package builder;

public class UserBuilderExample2 {

    private String name;
    private String surName;
    private String country;
    private String city;

    public UserBuilderExample2() {

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "UserBuilderExample2{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


    public static Builder newBuilder(){
        return new UserBuilderExample2().new Builder();
    }

    public class Builder {

        public Builder name(String name) {

            UserBuilderExample2.this.name = name;
            return this;
        }

        public Builder surName(String surName) {

            UserBuilderExample2.this.surName = surName;
            return this;
        }

        public Builder country(String country) {

            UserBuilderExample2.this.country = country;
            return this;
        }

        public Builder city(String city) {

            UserBuilderExample2.this.city = city;
            return this;
        }

        public UserBuilderExample2 build(){

            return UserBuilderExample2.this;
        }


    }
}
