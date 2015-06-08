package BD;

public class User {
    private int id;
    private String name;
    private String year_of;

    public User() {

    }

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, String year_of) {
        this.id = id;
        this.name = name;
        this.year_of = year_of;
    }

    public User(String name, String year_of) {
        this.name = name;
        this.year_of = year_of;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear_of() {
        return year_of;
    }

    public void setYear_of(String year_of) {
        this.year_of = year_of;
    }
}