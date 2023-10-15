package com.springdatajpa.practice.testresult.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/results")
public class ResultsController {

    private final ResultsService resultsService;

    public ResultsController(ResultsService resultsService){
        this.resultsService = resultsService;
    }

    @GetMapping("/{resultCode}")
    public String findResultByCode(@PathVariable int resultCode, Model model){


    }

}
