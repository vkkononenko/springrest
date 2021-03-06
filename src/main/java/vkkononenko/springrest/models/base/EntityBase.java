package vkkononenko.springrest.models.base;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class EntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    protected Long id;

    @Column(updatable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    @JsonIgnore
    protected Date dateCreated;

    @Temporal(value = TemporalType.TIMESTAMP)
    @JsonIgnore
    protected Date dateUpdated;

    @PrePersist
    private void init(){
        dateCreated = new Date();
    }

    @PreUpdate
    private void update() {
        dateUpdated = new Date();
    }

    public EntityBase() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
