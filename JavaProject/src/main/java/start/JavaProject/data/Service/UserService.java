package start.JavaProject.data.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import start.JavaProject.data.Entity.User;
import start.JavaProject.data.Repository.UserRepository;

import java.util.List;
@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public List<User> readUsers (){return userRepo.findAll();}

    public User createUser(User user){return userRepo.save(user);}

    public void deleteUser (long id){userRepo.deleteById(id);}

    public User updateUser (long id, User user){
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setPassword(user.getPassword());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setUsername(user.getUsername());
        updatedUser.setLocation(user.getLocation());

        return updatedUser;
    }

    public User findUserByEmailAndPassword(String email, String password){
        return userRepo.findByEmalAndPassword(email,password);
    }
}

