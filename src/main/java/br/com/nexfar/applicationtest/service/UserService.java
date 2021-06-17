package br.com.nexfar.applicationtest.service;

import br.com.nexfar.applicationtest.model.UserModel;
import br.com.nexfar.applicationtest.repository.UserRepository;
import org.bson.BsonString;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

    final
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserModel userModel = userRepository.findByLogin(new BsonString(s));

        if (userModel == null) {
            return null;
        }

        return new User(userModel.getLogin(), userModel.getPassword(), new ArrayList<>());
    }

}
