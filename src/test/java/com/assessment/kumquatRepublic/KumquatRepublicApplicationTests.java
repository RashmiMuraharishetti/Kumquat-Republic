package com.assessment.kumquatRepublic;

import com.assessment.kumquatRepublic.Controller.ClothesController;
import com.assessment.kumquatRepublic.Entity.Clothes;
import com.assessment.kumquatRepublic.Service.ClothesService.ClothesService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KumquatRepublicApplicationTests {

	@Mock
	private ClothesService mockService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testBrandList(){

	    String brand = "Gucci";
		List<Clothes> expected = new ArrayList<>();
		ClothesController clothesController = new ClothesController(mockService);

		when(mockService.getDressesByBrand(brand)).thenReturn(expected);

		List<Clothes> actual = clothesController.getDressesByBrand(brand);

        Assert.assertEquals(expected, actual);
	}

    @Test
    public void testColorList(){

        String color = "yellow";
        List<Clothes> expected = new ArrayList<>();
        ClothesController clothesController = new ClothesController(mockService);

        when(mockService.getDressesByColor(color)).thenReturn(expected);

        List<Clothes> actual = clothesController.getDressesByColor(color);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPriceList(){

        double price = 2200.00;
        List<Clothes> expected = new ArrayList<>();
        ClothesController clothesController = new ClothesController(mockService);

        when(mockService.getDressesByPrice(price)).thenReturn(expected);

        List<Clothes> actual = clothesController.getDressesByPrice(price);

        Assert.assertEquals(expected, actual);
    }


}

