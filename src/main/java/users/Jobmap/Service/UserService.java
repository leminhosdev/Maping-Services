package users.Jobmap.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import users.Jobmap.model.User;
import users.Jobmap.repository.UserRepository;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;

    public List<User> Listall() {
       return userRepository.findAll();
    }
    public User findByIDorThrowBadRequestException(long id){
        return userRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST));
    }
    public User save(User user){
        return userRepository.save(user);
    }
    public void delete(long id){
        userRepository.delete(findByIDorThrowBadRequestException(id));
    }

}
