package com.assessment.kumquatRepublic.Controller;


import com.assessment.kumquatRepublic.Entity.Clothes;
import com.assessment.kumquatRepublic.Service.ClothesService.ClothesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dresses")
public class ClothesController {

    private final ClothesService clothesService;

    public ClothesController(ClothesService clothesService) {
        this.clothesService = clothesService;
    }


    @RequestMapping(value = "/brand/get/{brand}", method = RequestMethod.GET)
    public List<Clothes> getDressesByBrand(@PathVariable String brand){
        List<Clothes> dresses = clothesService.getDressesByBrand(brand);
        return dresses;
    }

    @RequestMapping(value = "/color/get/{color}", method = RequestMethod.GET)
    public List<Clothes> getDressesByColor(@PathVariable String color){
        List<Clothes> dresses = clothesService.getDressesByColor(color);
        return dresses;
    }

    @RequestMapping(value = "/price/get/{price}", method = RequestMethod.GET)
    public List<Clothes> getDressesByPrice(@PathVariable double price){
        List<Clothes> dresses = clothesService.getDressesByPrice(price);
        return dresses;
    }

    //Multiple filters

    @RequestMapping(value = "/orderAsc/get/{price}", method = RequestMethod.GET)
    public List<Clothes> orderDressesByPriceAscending(@PathVariable double price){
        List<Clothes> dresses = clothesService.orderDressesByPriceAscending(price);
        return dresses;
    }

    @RequestMapping(value = "/orderDesc/get/{price}", method = RequestMethod.GET)
    public List<Clothes> orderDressesByPriceDescending(@PathVariable double price){
        List<Clothes> dresses = clothesService.orderDressesByPriceDescending(price);
        return dresses;
    }

}
