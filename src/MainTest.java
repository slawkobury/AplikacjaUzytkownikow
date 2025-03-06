public class MainTest {


    public static void main(String[] args) {
        UserManager manager1 = new UserManager();

        User user1 = new User("Jan", "JanEmail@gmail.com");
        User user2 = new User("An", "AnEmail@gmail.com");
        User user3 = new User("Adrian", "JanEmail@gmail.com");


        manager1.dodajUzytkownikow1(user1);


        manager1.dodajUzytkownikow1(user2);
        manager1.dodajUzytkownikow1(user3);

        manager1.wyswietlUzytkownikow1();

    }
}
