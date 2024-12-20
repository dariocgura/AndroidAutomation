package com.nttdata.steps;

import com.nttdata.screens.ProductsScreen;

public class ShopSteps {
    ProductsScreen productsScreen;

    public void isProductDisplay(){

        productsScreen.validarProductos();

    }
}
