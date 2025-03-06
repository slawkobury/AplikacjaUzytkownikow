import java.util.ArrayList;
import java.util.List;

public class UserManager {


    private List<User> listaUzytkownikow1;

    public UserManager() {
        listaUzytkownikow1 = new ArrayList<>();
    }

    // Metoda dodająca użytkownika do listy
    public void dodajUzytkownikow1(User user1) {
        listaUzytkownikow1.add(user1);
    }

    // Metoda wyświetlająca wszystkich użytkowników
    //uzytkownikMojaNowaNazwa nowy objekt classy  User.  Znika po zakonczeniu metody wyswietlUzytkownikow1)
    public void wyswietlUzytkownikow1(){
        for (User uzytkownikMojaNowaNazwa : listaUzytkownikow1) {
            System.out.println("Nazwa: " + uzytkownikMojaNowaNazwa.getUsername1() + ", Email: " + uzytkownikMojaNowaNazwa.getEmail());
        }
    }

}
