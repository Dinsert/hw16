package org.skypro.skyshop;

import java.util.Arrays;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;

public class App {

    public static void main(String[] args) {

        SimpleProduct product1 = new SimpleProduct("Course Java", 200_000);
        DiscountedProduct product2 = new DiscountedProduct("Course C++", 250_000, 50);
        SimpleProduct product3 = new SimpleProduct("Course Python", 100_000);
        DiscountedProduct product4 = new DiscountedProduct("Course Kotlin", 95_000, 95);
        FixPriceProduct product5 = new FixPriceProduct("Course С#");
        SimpleProduct product6 = new SimpleProduct("Course JavaScript", 400_000);

        ProductBasket productBasket = new ProductBasket();

        productBasket.addProduct(product1);
        productBasket.addProduct(product2);
        productBasket.addProduct(product3);
        productBasket.addProduct(product4);
        productBasket.addProduct(product5);
        productBasket.addProduct(product6);
        productBasket.printBasketContents();
        System.out.println(productBasket.getTotalBasketValue());
        System.out.println(productBasket.checkIfProductIsByBasket("Course С#"));
        System.out.println(productBasket.checkIfProductIsByBasket("Course С"));
        productBasket.clearBasket();
        productBasket.printBasketContents();
        System.out.println(productBasket.getTotalBasketValue());
        System.out.println(productBasket.checkIfProductIsByBasket("Course Python"));

        Article article1 = new Article("Course Java", "Method printf()");
        Article article2 = new Article("Course C++", "General rules language");
        Article article3 = new Article("Course Python", "Base knowledge");

        SearchEngine searchEngine = new SearchEngine(10);
        searchEngine.add(product1);
        searchEngine.add(product2);
        searchEngine.add(product3);
        searchEngine.add(product4);
        searchEngine.add(product5);
        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);
        System.out.println(Arrays.toString(searchEngine.search("Course")));
        System.out.println(Arrays.toString(searchEngine.search("rules")));
        System.out.println(Arrays.toString(searchEngine.search("Course Kotlin")));

    }

}
