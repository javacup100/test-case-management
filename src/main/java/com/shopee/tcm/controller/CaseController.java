package com.shopee.tcm.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/case")
public class CaseController {
//    @RequestMapping(value = "/submit",method = RequestMethod.POST)
//    public String receiveCode(@RequestBody TestPlan submittedCase){
//        String caseType=submittedCase.getType().toLowerCase();
//        String language=submittedCase.getLanguage().toLowerCase();
//        String content=submittedCase.getContent();
//        if (caseType.equals("code")){
//            if (language.equals("go")){
//                return GoExecutor.execute(language,content);
//            }
//        }else if (caseType.equals("json")){
//
//        }
//        return "hello";
//    }
}
