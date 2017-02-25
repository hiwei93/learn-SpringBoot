package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wei11 on 2017/2/17.
 */
@RestController
@RequestMapping("/say")
public class HelloController {

    @Autowired
    private Grilproperties grilproperties;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say(@RequestParam(value="id", required = false, defaultValue = "0") Integer id){
        return "id: " + id;
//        return grilproperties.getCupSize();
    }
}
