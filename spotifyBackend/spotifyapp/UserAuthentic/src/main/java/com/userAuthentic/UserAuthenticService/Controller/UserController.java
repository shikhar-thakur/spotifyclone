package com.userAuthentic.UserAuthenticService.Controller;

import com.userAuthentic.UserAuthenticService.Exception.InvalidCredentialsException;
import com.userAuthentic.UserAuthenticService.Exception.UserAlreadyExistsException;
import com.userAuthentic.UserAuthenticService.Service.SecurityTokenGenerator;
import com.userAuthentic.UserAuthenticService.Service.UserService;
import com.userAuthentic.UserAuthenticService.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/come/here")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {

    private UserService userService;

    private ResponseEntity responseEntity;
    private SecurityTokenGenerator securityTokenGenerator;
    @Autowired
    public UserController(UserService userService, SecurityTokenGenerator securityTokenGenerator) {
        this.userService = userService;

        this.securityTokenGenerator=securityTokenGenerator;
    }

    @PostMapping("/register")
    public ResponseEntity<?> saveUser(@RequestBody User user) throws UserAlreadyExistsException {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user) throws InvalidCredentialsException {
        Map<String, String> map = null;
        try{
            User retrievedUser = userService.findByEmailAndPassword(user.getEmail(), user.getPassword());
            if (retrievedUser.getEmail().equals(user.getEmail()) && retrievedUser.getPassword().equals(user.getPassword()))
            {
                System.out.println("username and passowrd" + retrievedUser.getEmail() + "pass" + retrievedUser.getPassword());
                map = securityTokenGenerator.generateToken(user);
                responseEntity = new ResponseEntity(map, HttpStatus.OK);
                System.out.println("token is generated");
            }
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            responseEntity = new ResponseEntity("Try after sometime!!!", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;

    }
}
