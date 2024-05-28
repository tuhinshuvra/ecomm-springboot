package quantum.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import quantum.org.service.CategoryService;
import quantum.org.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    @GetMapping("/shop/category/{id}")
    public String getProductByCategory(Model model, @PathVariable int id) {

        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProductsByCategoryId(id));
        return "shop";
    }

    @GetMapping("/shop/viewproduct/{id}")
    public String viewProductDetails(Model model, @PathVariable int id) {

        model.addAttribute("product", productService.getProductById(id).get());
        return "viewProduct";
    }

}
