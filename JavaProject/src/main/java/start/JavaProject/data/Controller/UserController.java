package start.JavaProject.data.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import start.JavaProject.data.Entity.Menu;
import start.JavaProject.data.Entity.User;
import start.JavaProject.data.Repository.MenuRepository;
import start.JavaProject.data.Repository.UserRepository;
import start.JavaProject.data.Service.MenuService;
import start.JavaProject.data.Service.UserService;


import java.util.List;


@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepo;
    @Autowired
    MenuService menuService;
    @Autowired
    MenuRepository menuRepository;


    @GetMapping("/signin")
    public String regUer (Model model) {
        model.addAttribute("user", new User());
        return "signin";
    }

    @PostMapping("/signin")
    public String createUsertoDB(@ModelAttribute User user){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userService.createUser(user);
        return "redirect:bravo";
    }

    //under construction
    @GetMapping("/uc")
    public String uc (){
        return "/uc";
    }

    @GetMapping("/")
    public String index (){
        return "index";
    }

    @GetMapping("/bravo")
    public String uc1 (){
        return "regsuccess";
    }


    //testcontroller login
    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);

        return "userstest";
    }


    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }

    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }



    @GetMapping("/search")
    public String search(Model model, @RequestParam(required = false) String location) {
        if (location != null) {
            List<User> users = userRepo.findByLocation(location);
            model.addAttribute("users", users);
        }
        return "search";
    }

    @GetMapping("/deleteMenu")
    public String deleteMenu(@RequestParam long menuId){
        menuService.deleteMenu(menuId);
        return "redirect:dashboard";
    }

    @GetMapping("/filtering")
    public String filtering(Model model,@RequestParam(required = false) String dateavailable,@RequestParam(required = false) String menutype){


        List<Menu> menus = menuRepository.findbydateandtype(dateavailable, menutype);
        if(menus.isEmpty()== true){System.out.println("uslo");}
        else
            model.addAttribute("menus",menus);
             return "search";
    }

}
