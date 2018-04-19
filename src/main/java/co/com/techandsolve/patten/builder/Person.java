package co.com.techandsolve.patten.builder;

/**
 * Created by Raul .A Alzate raul.alzate@techandsolve.com on 19/04/2018.
 */
public class Person {
    private String name;
    private String surname;
    private String identification;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdentification() {
        return identification;
    }

    private Person(String name, String surname, String identification) {
        this.name = name;
        this.surname = surname;
        this.identification = identification;
    }

     public static class PersonBuilder {
        private String name;
        private String surname;
        private String identification;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setIdentification(String identification) {
            this.identification = identification;
            return this;
        }

        public Person createPerson() {
            return new Person(name, surname, identification);
        }
    }
}
