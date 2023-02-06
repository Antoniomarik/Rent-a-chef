package start.JavaProject.data.Service;

import org.springframework.stereotype.Service;
import start.JavaProject.data.Entity.Menu;
import start.JavaProject.data.Repository.MenuRepository;

import java.util.List;

@Service
public class MenuService {

    MenuRepository menuRepo;

    public Menu createMenu (Menu menu){return menuRepo.save(menu);}

    public List<Menu> readMenu (){return menuRepo.findAll();}

    public void deleteMenu (Long id){menuRepo.deleteById(id);}

    public Menu updateMenu (Long id, Menu menu){
        Menu updatedMenu = menuRepo.findById(id).get();

        updatedMenu.setMenuDescription(menu.getMenuDescription());
        updatedMenu.setMax_peoples(menu.getMax_peoples());
        updatedMenu.setPrice(menu.getPrice());

        return updatedMenu;
    }

}
