/**
 * @author Changhaoqin
 * @date 2021/5/13 15:14
 */
public class Peson {
    private String FirstName;
    private String LastName;
    private int age;

    public Peson() {
    }

    public Peson(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
