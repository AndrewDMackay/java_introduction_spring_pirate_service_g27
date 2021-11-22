
package models;

import javax.persistence.*;

@Entity
@Table(name="pirates")
public class Pirate {

    //    'PoJo' = 'Plain Old Java Object', required by Spring..

    //    A 'PoJo' requires 1. getters, and setters..
    //
    //    2. a default constructor, see below..

    //    3. Finally, they need an ID of type long..

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;

    public Pirate(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //    Below is an example of a default constructor..

    public Pirate(){

    }

    //    Below is an example of getters, and setters for the type long ID..

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
