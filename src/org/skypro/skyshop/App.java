package org.skypro.skyshop;

import java.util.Arrays;
import org.skypro.skyshop.model.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.model.DiscountedProduct;
import org.skypro.skyshop.model.FixPriceProduct;
import org.skypro.skyshop.model.Product;
import org.skypro.skyshop.model.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.model.Searchable;

public class App {

    public static void main(String[] args) {

        Product[] products = {
                new SimpleProduct("Course Java", 200_000),
                new DiscountedProduct("Course C++", 250_000, 50),
                new SimpleProduct("Course Python", 100_000),
                new DiscountedProduct("Course Kotlin", 95_000, 95),
                new FixPriceProduct("Course С#"),
                new SimpleProduct("Course JavaScript", 400_000)
        };

        ProductBasket productBasket = new ProductBasket();

        for (Product product : products) {
            productBasket.addProduct(product);
        }

        productBasket.printBasketContents();
        System.out.println(productBasket.getTotalBasketValue());
        System.out.println(productBasket.checkIfProductIsByBasket("Course Java"));
        System.out.println(productBasket.checkIfProductIsByBasket("Course С"));
        productBasket.clearBasket();
        productBasket.printBasketContents();
        System.out.println(productBasket.getTotalBasketValue());
        System.out.println(productBasket.checkIfProductIsByBasket("Course Python"));

        Searchable[] searchables = {
                new SimpleProduct("Course Java", 200_000),
                new DiscountedProduct("Course C++", 250_000, 50),
                new SimpleProduct("Course Python", 100_000),
                new DiscountedProduct("Course Kotlin", 95_000, 95),
                new FixPriceProduct("Course С#"),
                new SimpleProduct("Course JavaScript", 400_000),
                new Article("Course Java", "Method printf()"),
                new Article("Course C++", "General rules language"),
                new Article("Course Python", "Base knowledge")
        };

        SearchEngine searchEngine = new SearchEngine(10);

        for (Searchable searchable : searchables) {
            searchEngine.add(searchable);
        }

        System.out.println(Arrays.toString(searchEngine.search("Course")));
        System.out.println(Arrays.toString(searchEngine.search("rules")));
        System.out.println(Arrays.toString(searchEngine.search("Course Kotlin")));

    }

}
