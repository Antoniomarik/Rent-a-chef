package start.JavaProject.data.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import start.JavaProject.data.Entity.Menu;
import start.JavaProject.data.Entity.User;
import start.JavaProject.data.Repository.MenuRepository;
import start.JavaProject.data.Repository.UserRepository;

import java.util.List;

@RequestMapping("")
@Controller
public class rentachefController {

    @Autowired
    UserRepository userRepo;
    @Autowired
    MenuRepository menuRepo;

    @GetMapping("/rentachef")
    public String regUer (Model model, Model menus) {
        List<User> listUsers = userRepo.findAll();
        //List<Menu> listOfMenus = menuRepo.find;
        model.addAttribute("listUsers", listUsers);
        return "rentachef";
    }
}
