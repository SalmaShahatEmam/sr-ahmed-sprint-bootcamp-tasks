package com.product.app.controller;

import com.product.app.dao.ProductDao;
import com.product.app.dao.productDaoImp;
import com.product.app.dto.productDto;
import com.product.app.model.Product;
import com.product.app.model.ProductDetails;
import com.product.app.service.ProductServiceImplementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductDao productService;

    @RequestMapping("/all")
    public String index(Model model )
    {
        List<Product> products = this.productService.findAll();
        for (Product product : products) {
            System.out.println(product.toString());
        }
        model.addAttribute("products", products);

        return "products/all";
    }


    @RequestMapping("/{id}")
    public String show(Model model , @PathVariable("id") int id)
    {
        Product product = this.productService.findById(id);

        if(product == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }

        System.out.println(product.toString());
        model.addAttribute("product", product);
        model.addAttribute("details", product.getDetails());
        return "products/show";
    }

    @RequestMapping("/create")
    public String create(Model model)
    {

        model.addAttribute("productDto", new productDto());
        return "products/create";
    }

    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public String save(@Valid @ModelAttribute("productDto") productDto productDto,
                       BindingResult result,
                       Model model)
    {

        if (result.hasErrors()) {
            return "/products/create"; // reload the form with errors
        }
        LocalDate date = LocalDate.parse(productDto.getExpirationDate());
        ProductDetails details = ProductDetails.builder()
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .manufacturer(productDto.getManufacturer())
                .expirationDate(date).availability(productDto.getAvailability())
                .build();
        Product product = Product.builder().name(productDto.getName()).details(details).build();
        this.productService.save(product);
        return "redirect:/products/all";
    }

    @RequestMapping("delete/{id}")
    public String delete(Model model , @PathVariable("id") int id)
    {
        this.productService.delete(id);
        return "redirect:/products/all";
    }

    @RequestMapping("edit/{id}")
    public String edit(Model model , @PathVariable("id") int id)
    {
        Product product = this.productService.findById(id);
        if(product == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }

        System.out.println(product.toString());
        model.addAttribute("product", product);
        model.addAttribute("details", product.getDetails());
        return "products/edit";
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String edit(Model model ,@ModelAttribute("product") productDto productDto )
    {
        LocalDate date = LocalDate.parse(productDto.getExpirationDate());
        ProductDetails details = ProductDetails.builder()
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .manufacturer(productDto.getManufacturer())
                .expirationDate(date).availability(productDto.getAvailability())
                .build();
        Product product = Product.builder().name(productDto.getName()).details(details).build();
        this.productService.update(product , productDto.getId());
        return "redirect:/products/all";
    }
}
