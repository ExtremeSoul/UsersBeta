package sdacademy.java7krk;

import java.util.LinkedList;
import java.util.List;

public class Printer {

    public static void main(String[] args) {
        //Linklista to są połączone elementy, każdy ma pokolei wskaźnik na następny w kolejce. Używana jak dodajemy
        //ArrayLista ma więcej indeksów i jak coś chcemy dodać do środka to musimy wszystko przesówać. Używana jak pobieramy
        List<User> users = new LinkedList<>();
        User developer = new Developer();
        User admin = new Admin();
        User guest = new Guest();

        //obiekt po kropce metoda a w nawiasie parametr metody
        users.add(developer);
        users.add(admin);
        users.add(guest);

        for (User user : users) {
            user.printMyRole();

        }

    }

}
