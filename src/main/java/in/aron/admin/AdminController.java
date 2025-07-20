package in.aron.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import in.aron.utility.JWTUtil;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private JWTUtil jwtUtil;

    @GetMapping
    public ResponseEntity<?> adminPage(@RequestHeader("Authorization") String authHeader) {
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String token = authHeader.substring(7);
            if (jwtUtil.validateToken(token)) {
                return ResponseEntity.ok("Welcome, admin!");
            }
        }
        return ResponseEntity.status(401).body("Unauthorized");
    }
}

