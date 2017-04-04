package ness.edu.intentsdemo;

import java.io.Serializable;

/**
 * Created by Android2017 on 4/4/2017.
 */

public class Person implements Serializable{

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;


}
