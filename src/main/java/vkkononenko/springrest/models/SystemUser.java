package vkkononenko.springrest.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import vkkononenko.springrest.models.base.EntityBase;

import java.util.List;

@Entity
@Table(name = "SystemUser")
public class SystemUser extends EntityBase {

    private String login;

    private String accountNum;

    @OneToMany
    private List<Person> personList;

    public SystemUser() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
