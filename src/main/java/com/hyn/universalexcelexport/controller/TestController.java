package com.hyn.universalexcelexport.controller;

import com.hyn.universalexcelexport.entity.Student;
import com.hyn.universalexcelexport.utils.MyCsvFileUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hyn
 * @version 1.0.0
 * @description
 * @date 2023/3/6
 */
@RestController
public class TestController {
    @GetMapping("/universalExcelExport")
    public void universalExcelExport(){
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setName("郝亚宁");
        student.setAge(2);
        student.setGrade(2);
        student.setMsg("我爱你");
        student.setBackground("局长");
        Student student1 = new Student();
        student1.setName("王小二");
        student1.setAge(2);
        student1.setGrade(3);
        student1.setMsg("副局长");
        student1.setBackground("管打");
        list.add(student);
        list.add(student1);
        String fileName = "/Users/austin/Documents/tool/"+ MyCsvFileUtil.buildCsvFileFileName(list);
        //String tableNames = MyCsvFileUtil.buildCsvFileTableNames(list);
        List<String> tableNamesList = MyCsvFileUtil.resolveExcelTableName(student);
        String tableNames = MyCsvFileUtil.buildCsvFileTableNamesNew(tableNamesList);
        MyCsvFileUtil.writeFile(fileName,tableNames);
        String currentBody = MyCsvFileUtil.buildCsvFileBodyMap(list);
        MyCsvFileUtil.writeFile(fileName,currentBody);
    }
}
