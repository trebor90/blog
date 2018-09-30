package pl.trebor.serverblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test2")
public class MainController {

    @GetMapping(value = "method")
    public String testMethod() {
        return "test method";
    }
}
