package phonebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import phonebook.entity.Contact;

import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {
    List<Contact>contacts;
    public  HomeController(){
        this.contacts=new LinkedList<>();

    }
    @GetMapping("/")
    public ModelAndView home(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        modelAndView.addObject("contacts",this.contacts);
        return modelAndView;
    }

    @PostMapping("/")
    public String add(Contact contact){
        this.contacts.add(contact);
        return "redirect:/";
    }
}
