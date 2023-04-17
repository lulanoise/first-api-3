package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class StringController {

    @GetMapping("/strings")
    public String concatenateStrings(@RequestParam String first, @RequestParam(required = false) String second)
    {
        if (second != null) {
            return first + second;
        } else {
            return first;
        }
    }
}
