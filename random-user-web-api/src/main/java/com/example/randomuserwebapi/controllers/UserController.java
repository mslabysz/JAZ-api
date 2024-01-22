package com.example.randomuserwebapi.controllers;

import com.example.randomuserwebapi.contracts.UserDto;
import com.example.randomuserwebapi.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;
    private static URI getLocationUri(long id) {

        return ServletUriComponentsBuilder.fromCurrentRequest()
                .path(id+"")
                .buildAndExpand(1)
                .toUri();
    }
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers(){
        var users = userService.getAllUsers();
        if(users == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable long id){
        var user = userService.getById(id);
        if(user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }
    @PostMapping
    public ResponseEntity<Long> save(@RequestBody UserDto userDto){
        var id = userService.save(userDto);
        return ResponseEntity.created(getLocationUri(id)).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable long id){
        var user = userService.deleteById(id);
        if(user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity updateById(@PathVariable long id, @RequestBody UserDto userDto){
        var user = userService.updateById(id, userDto);
        if(user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }
}
