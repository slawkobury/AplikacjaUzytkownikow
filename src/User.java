public class User {

    private static int liczbaUzytkownikow = 0;
    private String username1;
    private String email1;


    public User(String username2, String email2) {
        if (username2.length() >= 3) {
            this.username1 = username2;
        } else {
            this.username1 = username2;
            this.username1 = "Nieznany";
        }
        this.email1 = email2;
        liczbaUzytkownikow++;
    }

    public String getUsername1() {
        return username1;
    }

    public String getEmail(){
        return email1;
    }

    public static int getLiczbaUzytkownikow() {
        return liczbaUzytkownikow;
    }

}
