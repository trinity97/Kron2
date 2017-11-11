package api;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Column
    private String name;
    @Id
    @Column(unique = true)
    private String rollNumber;
    @Column(unique = true)
    private String email;
    @Column
    private String password;
    @Column
    private Group groupType;

    @Column
    @OneToMany(mappedBy = "courseId")
    private Set<Course> auditedCourse = new HashSet<>();


    public User(String name, String rollNumber, String email, String password, Group groupType) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.email = email;
        this.password = password;
        this.groupType = groupType;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Group getGroupType() {
        return groupType;
    }

    public void setGroupType(Group groupType) {
        this.groupType = groupType;
    }
}

