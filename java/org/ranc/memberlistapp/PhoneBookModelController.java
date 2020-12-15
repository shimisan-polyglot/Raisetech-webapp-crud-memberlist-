package org.ranc.memberlistapp;

import org.ranc.memberlistapp.domain.model.PhoneBookModel;
import org.ranc.memberlistapp.domain.repository.PhoneBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhoneBookModelController {

	@Autowired
    PhoneBookRepository phoneBookRepository;

	
	 
	
	
    @GetMapping("/")
    public String hello(Model model) {
        /* (2) */
    	//phoneBookModelがデータベースの情報をさしている。selectByPrimarykey()の引数の中に数字を入れると
    	//idに応じた情報が取得できる。phoneBookModel,phoneBookModel2はaddAttributeに渡す変数名なので、
    	//modelの引数に入れる際には必ず同じ名前にする。modelの中身は最初がmodelの渡したいデータの名前、次が中身
    	//最後にreturn""の中に戻り値をいれるという処理
        PhoneBookModel phoneBookModel = phoneBookRepository.selectByPrimaryKey(1); 
        PhoneBookModel phoneBookModel2 = phoneBookRepository.selectByPrimaryKey(2); 
        model.addAttribute("phoneBook", phoneBookModel);
        model.addAttribute("phoneBook2", phoneBookModel2);
        model.addAttribute("greeting", "Hello, World!");
        return "index";
       
        
    }
}
