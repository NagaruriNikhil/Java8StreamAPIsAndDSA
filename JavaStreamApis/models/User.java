package JavaStreamApis.models;

public class User {
    public int id;
    public String name;
    public boolean active;

    public User(int id, String name, boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + "(" + (active ? "Active" : "Inactive") + ")";
    }

}
