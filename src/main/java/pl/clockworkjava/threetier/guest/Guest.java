package pl.clockworkjava.threetier.guest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int age;
    private String personalIdentificationNumber;

    public Guest() {

    }

    public Guest(String name, int age, String personalId) {
        this.name = name;
        this.age = age;
        this.personalIdentificationNumber = personalId;
    }

    public long getId() {
        return this.id;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public String getPersonalIdentificationNumber() {
        return personalIdentificationNumber;
    }
}
