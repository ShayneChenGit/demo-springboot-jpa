package jpa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "tUser")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;
    private int gender;
    private String email;
}

