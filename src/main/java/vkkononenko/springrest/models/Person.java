package vkkononenko.springrest.models;

import vkkononenko.springrest.models.base.EntityBase;

import javax.persistence.Entity;

@Entity
public class Person extends EntityBase {

    private String firstName;

    private String lastName;

    private String phoneNum;

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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
