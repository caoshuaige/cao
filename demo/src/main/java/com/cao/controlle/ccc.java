package com.cao.controlle;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ccc {

    @GetMapping("test")
    public String test(){
      return "ssssssssss";
    }

}
