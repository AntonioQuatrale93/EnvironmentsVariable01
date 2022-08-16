package com.example.EnvironmentVariable01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
public class MainController {
    @Autowired
    Environment environment;


    @GetMapping("/")
    public String getVariable() {
        return environment.getProperty("myCustomVarTree.authName") + " " + environment.getProperty("myCustomVarTree.devName");
    }
}
