import java.util.Calendar;

public class drivingLicense {
    private String name;
    private String surname;
    private String address;
    private String issueYear;

    public String getName() {
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(String issueYear) {
        if (Integer.parseInt(issueYear) >= 1980 && Integer.parseInt(issueYear) <= Calendar.getInstance().get(Calendar.YEAR)) {
            this.issueYear = issueYear;
        }
    }

    public void getLicense() {
        System.out.println("------ Driving License Info ------");
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Address: " + getAddress());
        System.out.println("Issue year: " + getIssueYear());
        System.out.println("----------------------------------");
    }
}