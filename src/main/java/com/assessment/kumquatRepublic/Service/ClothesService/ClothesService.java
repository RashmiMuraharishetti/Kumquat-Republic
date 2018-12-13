package com.assessment.kumquatRepublic.Service.ClothesService;

import com.assessment.kumquatRepublic.Entity.Clothes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClothesService {

    Clothes dress1 = new Clothes(1, "dresses","Gucci", "yellow", 2272.00);
    Clothes dress2 = new Clothes(2, "dresses","Gucci", "red", 2000.00);
    Clothes dress3 = new Clothes(3, "dresses","Marni", "brown", 172.00);
    Clothes dress4 = new Clothes(4, "dresses","Marni", "pink", 302.00);
    Clothes dress5 = new Clothes(5, "dresses","Prada", "black", 2255.00);
    Clothes dress6 = new Clothes(6, "dresses","Prada", "black", 2242.00);
    Clothes dress7 = new Clothes(7, "dresses","Victoria", "blue", 1122.00);
    Clothes dress8 = new Clothes(8, "dresses","Celine", "beige", 2122.00);
    Clothes dress9 = new Clothes(9, "dresses","Jill", "orange", 902.00);

    List<Clothes> dressList = new ArrayList<>();


    public ClothesService(List<Clothes> dressList) {
        this.dressList = dressList;
    }

    public void setDressList(){
        dressList.add(dress1);
        dressList.add(dress2);
        dressList.add(dress3);
        dressList.add(dress4);
        dressList.add(dress5);
        dressList.add(dress6);
        dressList.add(dress7);
        dressList.add(dress8);
        dressList.add(dress9);
    }


    public List<Clothes> getDressesByBrand(String brand){
        setDressList();
        List<Clothes> brandList = dressList.stream().filter(d->d.getBrand().equals(brand)).collect(Collectors.toList());
        return brandList;
    }

    public List<Clothes> getDressesByColor(String color){
        setDressList();
        List<Clothes> colorList = dressList.stream().filter(d->d.getColor().equals(color)).collect(Collectors.toList());
        return colorList;
    }

    public List<Clothes> getDressesByPrice(double price){
        setDressList();
        List<Clothes> priceList = dressList.stream().filter(d->d.getPrice() == price).collect(Collectors.toList());
        return priceList;
    }

    public List<Clothes> orderDressesByPriceAscending(double price){
        setDressList();
        List<Clothes> priceList = dressList.stream().filter(d->d.getPrice() == price).collect(Collectors.toList());
        priceList.sort(Comparator.comparingDouble(Clothes::getPrice));
        return priceList;
    }

    public List<Clothes> orderDressesByPriceDescending(double price){
        setDressList();
        List<Clothes> priceList = dressList.stream().filter(d->d.getPrice() == price).collect(Collectors.toList());
        priceList.sort(Comparator.comparingDouble(Clothes::getPrice).reversed());
        return priceList;
    }

}
