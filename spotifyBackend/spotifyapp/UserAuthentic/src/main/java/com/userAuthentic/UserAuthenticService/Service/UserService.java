package com.userAuthentic.UserAuthenticService.Service;

import com.userAuthentic.UserAuthenticService.Exception.InvalidCredentialsException;
import com.userAuthentic.UserAuthenticService.Exception.UserAlreadyExistsException;
import com.userAuthentic.UserAuthenticService.domain.User;

public interface UserService {

    User saveUser(User user)throws UserAlreadyExistsException;
    User findByEmailAndPassword(String email, String password)throws InvalidCredentialsException;
}
