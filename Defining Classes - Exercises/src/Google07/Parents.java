package Google07;

public class Parents {
    private String name;
    private String birthday;

    public Parents(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getInfo() {
        return this.name + " " + this.birthday;
    }
}
