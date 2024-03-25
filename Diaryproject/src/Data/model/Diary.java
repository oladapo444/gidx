package Data.model;

import java.util.ArrayList;

public class Diary {
    public static String username;
    private String password;
    private boolean Islocked;
    private ArrayList<Entry> entries;
    private String Username;

    public Diary(String username, String password){
        this.username = username;
        this.password = password;
        this.Islocked = false;
}

    public Diary() {

    }

    public static Diary findById(String username) {
        Diary id = null;
        return id;
    }

    public static void SetIsLocked(boolean b) {
    }

    public static void delete(Diary diary) {
    }

    public static boolean Delete() {
        return false;
    }

    public int getId() {
        int id = 0;
        return id;
    }



    public static void save(Diary diary) {

    }

    public String getUsername() {
    return username;
    }

    public String getPassword() {
    return password;
    }

    public void setPassword(String password) {
    this.password = password;
    }

    public void setUsername(String password) {
    this.Username = Username;
    }
}

