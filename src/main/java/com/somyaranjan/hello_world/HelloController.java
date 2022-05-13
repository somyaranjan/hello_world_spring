package com.somyaranjan.hello_world;

import java.util.List;

import com.somyaranjan.hello_world.model.User;
import com.somyaranjan.hello_world.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private UserRepository repo;
    
    @GetMapping("/users")
    public String listAll(Model model){
        List<User> listUsers = repo.findAll();
        model.addAttribute("listUsers", listUsers);
        return "Users";
    }

    @GetMapping("/data")
    public List<User> getAllNotes()
    {
        return repo.findAll();
    }
}

