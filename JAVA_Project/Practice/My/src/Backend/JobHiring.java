package Backend;

class UserH {

    private String firstname;
    private String lastname;

    public UserH(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}

public class JobHiring extends UserH {

    private int id;
    private String title;

    public JobHiring(String firstname, String lastname, int id, String title) {
        super(firstname, lastname);
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.print("Name : " + super.getFirstname() + "  ");
        System.out.print(super.getLastname() + "  ");
        System.out.println(title);
        System.out.println("User Id : " + id);
    }
}
