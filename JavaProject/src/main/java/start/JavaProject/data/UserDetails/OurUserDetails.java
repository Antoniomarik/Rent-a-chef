package start.JavaProject.data.UserDetails;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import start.JavaProject.data.Entity.Menu;
import start.JavaProject.data.Entity.User;

import java.util.Collection;
import java.util.List;

public class OurUserDetails implements UserDetails {
    private User user;

    public OurUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return null;
    }

   @Override
    public String getPassword (){
        return user.getPassword();
   }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    public List<Menu> getMenu(){return user.getMenu();}

    public String getEmail(){return user.getEmail();}

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}
