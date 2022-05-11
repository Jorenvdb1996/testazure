package be.thomasmore.graduaten.hethalfkieke.hethalfkieke.controllers;

import be.thomasmore.graduaten.hethalfkieke.hethalfkieke.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private final ProductRepository productRepository;

    public MainController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("/")
    public String navigateToIndex() {
        return "index";
    }

}