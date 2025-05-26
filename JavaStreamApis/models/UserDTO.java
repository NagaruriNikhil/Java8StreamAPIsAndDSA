package JavaStreamApis.models;

public class UserDTO {
    public int id;
    public String name;

    public UserDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + ":" + name;
    }
}
