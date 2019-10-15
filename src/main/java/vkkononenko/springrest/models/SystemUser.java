package vkkononenko.springrest.models;

import javax.persistence.Entity;
import javax.persistence.Table;

import vkkononenko.springrest.models.base.EntityBase;

@Entity
@Table(name = "SystemUser")
public class SystemUser extends EntityBase {

    private String login;

    private String accountNum;

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
}
