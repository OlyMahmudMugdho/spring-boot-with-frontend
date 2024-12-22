package com.mahmud.react_with_spring_boot.controllers;

import com.mahmud.react_with_spring_boot.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(originPatterns = "*")
@RequestMapping(value = {"/api/hello","/api/hello/"})
public class ExampleApi {
    @GetMapping()
    public ResponseEntity<Response> index() {
        return ResponseEntity.ok(new Response(true,"Hello World"));
    }
}
