package jpa.prac2.Prac2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jpa.prac2.Prac2.repository.DepartmentRepository;

@Controller
public class DepartmentController {

    @Autowired DepartmentRepository departmentRepository;

    @RequestMapping("department/list1")
    public String list1(Model model) {
        model.addAttribute("departments", departmentRepository.findAll());
        return "department/list1";
    }

    @RequestMapping("department/list2")
    public String list2(Model model) {
        model.addAttribute("departments", departmentRepository.findAll());
        return "department/list2";
    }
}
