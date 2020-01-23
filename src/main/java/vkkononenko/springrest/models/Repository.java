package vkkononenko.springrest.models;

import vkkononenko.springrest.models.base.EntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Repository extends EntityBase {

    @ManyToOne
    private SystemUser uploadedBy;

    private String type;

    @Column(columnDefinition = "bytea")
    private Byte[] content;

    public  Repository() {

    }

    public SystemUser getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(SystemUser uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte[] getContent() {
        return content;
    }

    public void setContent(Byte[] content) {
        this.content = content;
    }
}
