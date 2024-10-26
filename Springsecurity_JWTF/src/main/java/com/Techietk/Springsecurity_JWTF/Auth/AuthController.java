package com.Techietk.Springsecurity_JWTF.Auth;

import com.Techietk.Springsecurity_JWTF.Model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    @Autowired
    private final AuthService authService;

     @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest registerRequest){
       AuthenticationResponse authResponse=authService.register(registerRequest);
       return ResponseEntity.ok(authResponse);
    }
    @GetMapping()
    public List<User> getall(){
         return authService.getall();

    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
         return ResponseEntity.ok(authService.authenticate(request));
    }
}
