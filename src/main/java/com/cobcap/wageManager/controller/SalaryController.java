package com.cobcap.wageManager.controller;

import com.cobcap.wageManager.service.PersonService;
import com.cobcap.wageManager.service.SalaryService;
import com.cobcap.wageManager.vo.SalaryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/salary")
public class SalaryController {

    private static int pageSize = 10;

    @Autowired
    private SalaryService salaryService;

    @Autowired
    private PersonService personService;

    @RequestMapping(value = {"/page", "/page/{num}"})
    public List<SalaryVo> getBonuses(@PathVariable(required = false) Integer num) {
        if(num == null)
            num = 1;
        return salaryService.getSalaryVOs(num, pageSize);
    }

    @RequestMapping("/pageCount")
    public int getPageCount() {
        return salaryService.getPageCount(pageSize);
    }


    /*获取指定id的person的salary信息*/
    @RequestMapping("/person/{id}/{num}")
    public Map getSalaryByPersonId(@PathVariable Integer id,
                                   @PathVariable Integer num) {

        Map<String, Object> map = new HashMap<>();
        String code = "200";
        if (personService.getById(id) == null) {
            code = "404";
        }
        map.put("code", code);
        map.put("data", salaryService.transFormData(salaryService.getSalaryByPersonId(num, 10, id)));
        return map;
    }

    /*获取指定id用户的工资信息的条数*/
    @RequestMapping("/person/{personId}/count")
    public int getSalaryCountByPersonId(@PathVariable Integer personId) {
        int totalCount = salaryService.getSalaryCountByPersonId(personId);
        return salaryService.getSalaryCount(totalCount, 10);
    }




//    @RequestMapping("/delete/{id}")
//    public Boolean deleteById(@PathVariable Integer id) {
//        return salaryService.delete(id);
//    }
//
//    @RequestMapping("/update")
//    public Boolean update(@RequestBody Salary salary) {
//        return salaryService.update(bonus);
//    }
}
