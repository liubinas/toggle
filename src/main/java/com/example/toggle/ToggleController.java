package com.example.toggle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@Controller // This means that this class is a Controller
@RequestMapping(path="/api") // This means URL's start with /demo (after Application path)
public class ToggleController {

    @Autowired
    private ToggleService toggleService;

    @GetMapping(path="/toggle/{status}") // Map ONLY POST Requests
    public @ResponseBody String toggle (@PathVariable boolean status) {

        Toggle toggleObj = toggleService.getToggle();
        toggleObj.setStatus(status);
        toggleObj = toggleService.saveToggle(toggleObj);

        return toggleObj.toString();
    }
}