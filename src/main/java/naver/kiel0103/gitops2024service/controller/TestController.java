package naver.kiel0103.gitops2024service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/lowercase")
    public ResponseEntity<String> toLowerCase(
            @RequestParam("input") String input
    ) {
        return ResponseEntity.ok(input.toLowerCase());
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("healthy");
    }
}
