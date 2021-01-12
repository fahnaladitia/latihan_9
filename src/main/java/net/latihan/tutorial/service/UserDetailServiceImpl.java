package net.latihan.tutorial.service;
;
import net.latihan.tutorial.model.User;
import net.latihan.tutorial.repositories.MyUserDetails;
import net.latihan.tutorial.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getUserByUsername(username);

        if (user == null) {
            throw  new UsernameNotFoundException("Could Not Find User");
        }
        return new MyUserDetails(user);
    }
}
