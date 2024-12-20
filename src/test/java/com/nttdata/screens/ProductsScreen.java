package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductsScreen extends PageObject {


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement SauceLabsBackPack;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement SauceLabsBikeLight;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement SauceLabsBoltTShirt;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Fleece Jacket\"]")
    private WebElement SauceLabsFleecejacket;

    public boolean validarProductos(){


        boolean todosDisponibles = true;
        if (SauceLabsBackPack.isDisplayed())
        {
            System.out.println("Esta disponible primer elemento");
        }
        else
        {
           System.out.println("No disponible primer elemento");
           todosDisponibles = false;
        }

        if (SauceLabsBikeLight.isDisplayed())
        {
            System.out.println("Esta disponible segundo elemento");
        }
        else
        {
            System.out.println("No disponible segundo elemento");
            todosDisponibles = false;
        }

        if (SauceLabsBoltTShirt.isDisplayed())
        {
            System.out.println("Esta disponible tercero elemento");
        }
        else
        {
            System.out.println("No disponible tercero elemento");
            todosDisponibles = false;
        }

        if (SauceLabsFleecejacket.isDisplayed())
        {
            System.out.println("Esta disponible cuarto elemento");
        }
        else
        {
            System.out.println("No disponible cuarto elemento");
            todosDisponibles = false;
        }

        return todosDisponibles;


    }




}
