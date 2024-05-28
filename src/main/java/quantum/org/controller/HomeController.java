package quantum.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import quantum.org.service.CategoryService;
import quantum.org.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductService productService;

    @GetMapping({ "/", "/home" })
    public String getHome(Model model) {
        return "index";
    }

    @GetMapping("/shop")
    public String getShop(Model model) {

        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProduct());
        return "shop";
    }

}
