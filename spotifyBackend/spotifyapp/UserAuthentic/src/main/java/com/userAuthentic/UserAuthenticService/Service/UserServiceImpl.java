package com.userAuthentic.UserAuthenticService.Service;

import com.userAuthentic.UserAuthenticService.Exception.InvalidCredentialsException;
import com.userAuthentic.UserAuthenticService.Exception.UserAlreadyExistsException;
import com.userAuthentic.UserAuthenticService.Repository.UserRepository;
import com.userAuthentic.UserAuthenticService.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) throws UserAlreadyExistsException {
        if(userRepository.findById(user.getEmail()).isPresent())
        {
            throw new UserAlreadyExistsException();
        }
        return userRepository.save(user);
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws InvalidCredentialsException {
        System.out.println("email ---"+email);
        System.out.println("password ----"+password);
        User loggedInUser = userRepository.findByEmailAndPassword(email,password);
        System.out.println(loggedInUser);
        if(loggedInUser == null)
        {
            throw new InvalidCredentialsException();
        }

        return loggedInUser;
    }
    }
