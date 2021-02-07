package org.itstep.controller;

import org.itstep.domain.dao.StudentDao;
import org.itstep.domain.dto.StudentDto;
import org.itstep.domain.enitity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.ConverterRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

@Controller
public class HomeController {

    @Autowired
    private ConversionService conversionService;

    private final StudentDao studentDao;

    public HomeController(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @PostConstruct
    public void postConstruct() {
        boolean canConvert = conversionService.canConvert(String.class, BigDecimal.class);
    }

    @GetMapping
    public String index() {
//        Integer convert = conversionService.convert("1", Integer.class);
        return "index";
    }

    @PostMapping
//    public String create(@ModelAttribute StudentDto studentDto, BindingResult bindingResult) throws ParseException {
    public String create(@ModelAttribute Student student, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            System.out.println("Error binding");
            System.out.println(bindingResult.getAllErrors());
            return "index";
        }
        studentDao.save(student);
        return "redirect:/";
    }

}
