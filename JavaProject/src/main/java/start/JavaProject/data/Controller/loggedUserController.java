package start.JavaProject.data.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import start.JavaProject.data.Entity.Menu;
import start.JavaProject.data.Entity.User;
import start.JavaProject.data.Repository.MenuRepository;
import start.JavaProject.data.Repository.UserRepository;
import start.JavaProject.data.Service.MenuService;
import start.JavaProject.data.Service.UserService;
import start.JavaProject.data.UserDetails.OurUserDetails;

import java.util.List;

@Controller
public class loggedUserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MenuService menuService;

    @Autowired
    private MenuRepository menuRepository;



    @GetMapping("/dashboard")
    public String viewUserDetails(@AuthenticationPrincipal OurUserDetails loggedUser,Model menuModel, Model moddel){
        String email = loggedUser.getUsername();
        User user = userRepository.findByEmail(email);
        moddel.addAttribute("user",user);

        List<Menu> menus = menuRepository.findByUser(user);
        menuModel.addAttribute("menus",menus);

        return "dashboard";
    }


    @GetMapping("/addmenu")
    public String regUer (Model model) {
        model.addAttribute("menu", new Menu());
        return "addmenu";
    }

    @PostMapping("/addmenu")
    public String createNewMenu(@ModelAttribute Menu menu, @AuthenticationPrincipal OurUserDetails loggedUser){
        String email = loggedUser.getUsername();
        User user = userRepository.findByEmail(email);

        menu.setUser(user);

        menuService.createMenu(menu);
        return "redirect:dashboard";
    }
}
