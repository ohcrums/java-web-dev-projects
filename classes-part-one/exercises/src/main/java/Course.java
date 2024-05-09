import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;
}

class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private Integer yearsTeaching;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getYearsTeaching() {
        return yearsTeaching;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(Integer yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
