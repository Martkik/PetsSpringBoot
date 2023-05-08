package com.wisercat.petsList.Pets.list2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PetsListController {
    private List<Pet> db = List.of(new Pet("a","1","ab","ac","ad"));

    static List<String> types = null;

    static {
        types = new ArrayList<>();
        types.add("Cat");
        types.add("Dog");
        types.add("Horse");
        types.add("Rabbit");
        types.add("Parrot");
    }
    @GetMapping("/")
    public String table() {
        return "table";
    }

    @GetMapping("/add.html")
    public String add(Model model, @ModelAttribute Pet pet) {
        System.out.println(pet.toString());
        model.addAttribute("types", types);
        return "add";
    }
    @RequestMapping(path = "/save-project", method = RequestMethod.POST)
    public String petRegistration(Model model, @ModelAttribute Pet pet) {

        model.addAttribute("types", pet);
        System.out.println(pet.toString());

        return "table";
    }

//    @GetMapping("/getList")
//    public List<Pet> get() {
//        System.out.println(db);
//    }
}
