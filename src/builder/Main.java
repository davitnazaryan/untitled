package builder;

import java.util.Observable;


public class Main {
    public static void main(String[] args) {

        User user = User.builder()
                .name("Davit")
                .surname("Nazaryan")
                .email("davit@mail.ru")
                .age(23)
                .country("Armenia")
                .city("Maralik")
                .build();

        System.out.println(user.toString());

    }
}
