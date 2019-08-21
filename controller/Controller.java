package com.MongoAssesment.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/users")
public class Controller {

    @Autowired
    private com.MongoAssesment.assesment.service.userService userService;

    @PostMapping("/add")
    public String createUser(
            @RequestParam("username") String uname,
            @RequestParam("password") String password,
            @RequestParam("emailId") String email,
            @RequestParam("contactNumber")BigInteger contact
            ) {
        return userService.createUser(uname,password,email,contact);
    }

    @GetMapping("/list")
    public List<?> listUsers(){
        return userService.listUsers();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id)
    {
        this.employeeRepo.deleteById(id);
    }
}
