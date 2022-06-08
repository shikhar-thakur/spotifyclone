package com.userAuthentic.UserAuthenticService.Service;

import com.userAuthentic.UserAuthenticService.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator {
    Map<String,String> generateToken(User user);
}
