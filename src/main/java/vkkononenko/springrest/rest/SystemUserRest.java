package vkkononenko.springrest.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import vkkononenko.springrest.models.SystemUser;
import vkkononenko.springrest.repos.SystemUserRepository;

import java.io.IOException;

@Component
@RestController
public class SystemUserRest {

    @Autowired
    private SystemUserRepository systemUserRepository;

    @Autowired
    private ObjectMapper mapper;

    @RequestMapping(path = "/SystemUser/get", produces = "APPLICATION/JSON")
    public String getSystemUser(@RequestParam(defaultValue = "1L") Long id) throws JsonProcessingException {
        return mapper.writeValueAsString(systemUserRepository.getById(id));
    }

    @RequestMapping(path = "/SystemUser/add", consumes = "APPLICATION/JSON", method = RequestMethod.POST)
    public void addSystemUser(@RequestBody String SystemUserJSON) throws IOException {
        systemUserRepository.save(mapper.readValue(SystemUserJSON, SystemUser.class));
    }
}
