package vkkononenko.springrest.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vkkononenko.springrest.models.SystemUser;

import java.util.List;

@Repository
public interface SystemUserRepository extends CrudRepository<SystemUser, Long> {
    public SystemUser getById(Long id);
    public List<SystemUser> getAllByIdNotNull();
}
