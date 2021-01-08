package pl.clockworkjava.threetier.guest;

public class GuestReadDTO {

    private int age;
    private String name;
    private long id;

    public GuestReadDTO(int age, String name, long id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
