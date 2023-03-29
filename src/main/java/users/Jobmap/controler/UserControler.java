package users.Jobmap.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import users.Jobmap.model.User;

import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserControler {
    @GetMapping(path = "list")
    public List<User> list(){
        return List.of(new User("dudu","malah","Bahia","jequie","sad"));
    }

}
