package builder;


public class Main {
    public static void main(String[] args) {

        UserBuilderExample1 user = UserBuilderExample1.builder()
                .name("Davit")
                .surname("Nazaryan")
                .email("davit@mail.ru")
                .age(23)
                .country("Armenia")
                .city("Maralik")
                .build();

        System.out.println(user.toString());

       UserBuilderExample2 user2 = UserBuilderExample2.newBuilder()
               .name("Davit")
               .surName("Nazaryan")
               .country("Armenia")
               .city("Maralik")
               .build();

        System.out.println(user2.toString());

    }
}
