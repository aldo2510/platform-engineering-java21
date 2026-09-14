package com.example.platform;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlatformController {

    @GetMapping("/api/platform")
    public Map<String, String> platform() {
        return Map.of(
                "message", "Hello from a Platform Engineering Golden Path",
                "java", "21"
        );
    }
}
