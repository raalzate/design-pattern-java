package co.com.techandsolve.patten.singleton;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public final class PersonSingleton {
    private static PersonSingleton ourInstance = new PersonSingleton();

    public static PersonSingleton getInstance() {
        return ourInstance;
    }

    private String fullname;

    private PersonSingleton() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
