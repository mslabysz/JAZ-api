package com.example.randomuserupdater.controller;

import com.example.randomuserupdater.updater.IUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/update")
@RequiredArgsConstructor
public class UpdateController {
    private final IUpdate updater;
    @GetMapping("/{size}")
    public ResponseEntity<?> update(@PathVariable int size) {
        new Thread(()->updater.update(size)).start();
        return ResponseEntity.ok("Update started. Time: " + LocalDateTime.now());
    }
}
