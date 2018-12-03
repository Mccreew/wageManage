package com.cobcap.wageManager.service;

import com.cobcap.wageManager.pojo.Person;
import com.cobcap.wageManager.pojo.Salary;
import com.cobcap.wageManager.vo.SalaryVo;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface SalaryService {
    Integer getSalaryIdByPersonId(Integer personId);

    Salary getById(Integer id);

    Boolean deleteById(Integer id);

    Boolean updateById(Salary salary);

    Boolean insert(Salary salary);

    List<Salary> getSalaries(int pageNum, int pageSize);

    int getTotalCount();

    BigDecimal getSalaryByPersonId(Integer id);

    Person getPersonBySalaryId(Integer id);

    void generateSalary();

    int getPageCount(int pageSize);

    List<SalaryVo> getSalaryVOs(int pageNum, int pageSize);

    Boolean updateSalaryByPersonId(Integer id, BigDecimal salary);

    Boolean deleteByPersonId(Integer id);

    Boolean updateSalary(Integer placeId);
}