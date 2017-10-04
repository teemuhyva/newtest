package springbootrest.springbootrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import springbootrest.springbootrest.entity.HenkilotEntity;
import springbootrest.springbootrest.entity.request.AddUserRequest;
import springbootrest.springbootrest.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    //test
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<HenkilotEntity> findAllUsers() {
        return userRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/{etunimi}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HenkilotEntity> getPersonByFirstName(@PathVariable String etunimi) {
        return userRepository.findByEtunimi(etunimi);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody AddUserRequest addUserRequest) {
        HenkilotEntity user = new HenkilotEntity();
        user.setId(addUserRequest.getId());
        user.setEtunimi(addUserRequest.getEtunimi());
        user.setSukunimi(addUserRequest.getSukunimi());
        user.setOsoite(addUserRequest.getOsoite());
        user.setEsimies(addUserRequest.getEsimies());

        userRepository.save(user);
    }
}
