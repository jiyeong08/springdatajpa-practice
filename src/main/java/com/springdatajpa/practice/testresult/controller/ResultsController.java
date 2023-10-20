package com.springdatajpa.practice.testresult.controller;

import com.springdatajpa.practice.common.Pagenation;
import com.springdatajpa.practice.common.PagingButton;
import com.springdatajpa.practice.testresult.dto.MemberDTO;
import com.springdatajpa.practice.testresult.dto.TestResultDTO;
import com.springdatajpa.practice.testresult.service.ResultService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/result")
public class ResultsController {

    private final ResultService resultService;

    public ResultsController(ResultService resultService){
        this.resultService = resultService;
    }

    @GetMapping("/{resultCode}")
    public String findResultByCode(@PathVariable int resultCode, Model model){

        TestResultDTO result = resultService.findResultByCode(resultCode);
        model.addAttribute("result", result);
        System.out.println(result);


        return "result/oneResult";

    }

    @GetMapping("/allResults")
    public String findResultList(Model model, @PageableDefault Pageable pageable){

        Page<TestResultDTO> resultList = resultService.findResultList(pageable);
        PagingButton paging = Pagenation.getPagingButtonInfo(resultList);
        model.addAttribute("resultList", resultList);
        model.addAttribute("paging", paging);

        return "result/allResults";

    }

    @GetMapping("/queryMethod")
    public void queryMethodPage(){}

    @GetMapping("/search")
    public String findByScore(@RequestParam String testItem, @RequestParam Integer testScore, Model model){

        List<TestResultDTO> resultList = resultService.findByScore(testItem, testScore);
        model.addAttribute("resultList", resultList);
        model.addAttribute("testItem", testItem);
        model.addAttribute("testScore", testScore);

        return "result/searchResult";
    }


    @GetMapping("/regist")
    public void registPage(){}

    @GetMapping(value = "/member", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<MemberDTO> findmemberList(){

        return resultService.findAllMember();

    }

    @PostMapping("/regist")
    public String registNewResult(TestResultDTO resultDTO, MemberDTO memberDTO){

        resultService.registNewResult(resultDTO, memberDTO);

        return "redirect:/result/allResults";

    }

    @GetMapping("/delete")
    public void deleteResult(){}

    @PostMapping("/delete")
    public String deleteResult(@RequestParam Integer resultCode){

        resultService.deleteResult(resultCode);

        return "redirect:/result/allResults";
    }

    @GetMapping("/modify")
    public void modifyResult(){}

    @PostMapping("/modify")
    public String modifyResult(TestResultDTO resultDTO){

        resultService.modifyResult(resultDTO);

        return "redirect:/result/" + resultDTO.getResultCode();
    }

}
