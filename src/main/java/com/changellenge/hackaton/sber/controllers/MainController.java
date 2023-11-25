package com.changellenge.hackaton.sber.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/composit")
public class MainController
{
    private static final String PROCESSOR_URL = "";

    @GetMapping("/allforms")
    public void getAllForms()
    {

    }

    @GetMapping("/client={id}")
    public void getForm(@PathVariable Long id)
    {

    }
}
