package naver.kiel0103.gitops2024service.controller;

import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class TestController {

    @GetMapping("/lowercase")
    public ResponseEntity<String> toLowerCase(
            @RequestParam("input") @NotNull String input
    ) {
        if (input != null && input.length() > 20) {
            return ResponseEntity.ok("input 값은 20자 이하여야 합니다.");
        }
        return ResponseEntity.ok(input.toLowerCase());
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("healthy");
    }
}
