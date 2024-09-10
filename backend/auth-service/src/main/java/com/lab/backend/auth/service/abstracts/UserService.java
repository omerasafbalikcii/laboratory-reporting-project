package com.lab.backend.auth.service.abstracts;

import jakarta.servlet.http.HttpServletRequest;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<String> login(AuthenticationRequest request);

    boolean initiatePasswordReset(String email);

    String handlePasswordReset(String token, String newPassword);

    void logout(String jwt);

    String changePassword(HttpServletRequest request, PasswordRequest passwordRequest);

    Map<String, String> verify();
}
