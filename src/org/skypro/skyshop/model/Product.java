package org.skypro.skyshop.model;

public abstract class Product implements Searchable {

    private final String nameProduct;

    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial();

    @Override
    public boolean searchTerm(String term) {
        return getName().contains(term.toUpperCase());
    }

    @Override
    public String getContentType() {
        return TypeContent.PRODUCT.getType();
    }

    @Override
    public String getName() {
        return nameProduct;
    }
}

enum TypeContent {
    PRODUCT("PRODUCT"), ARTICLE("ARTICLE");
    private String type;

    TypeContent(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    }
