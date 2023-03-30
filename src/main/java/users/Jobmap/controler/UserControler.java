package users.Jobmap.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import users.Jobmap.Service.UserService;
import users.Jobmap.model.User;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserControler {
    @Autowired
    private UserService userService;
    @GetMapping(path = "list")
    public List<User> list(){
        return List.of(new User("dudu","malah","Bahia","jequie","sad"));
    }
    @GetMapping(path = "/all")
    public ResponseEntity<List<User>> listall(){
        return ResponseEntity.ok(userService.Listall());
    }

}
