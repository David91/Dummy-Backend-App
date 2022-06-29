package app.controllers.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@Entity
public class User {
    private static int nextId = 0;

    private String name;
    private String surname;
    private double height;
    @Id
    @GeneratedValue
    private Integer id;

    public User(String name, String surname, double height) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        id = nextId++;
    }

}
