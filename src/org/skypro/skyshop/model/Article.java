package org.skypro.skyshop.model;

import org.skypro.skyshop.search.Searchable;

public class Article implements Searchable {

    private final String title;
    private final String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    @Override
    public String searchTerm() {
        return getName();
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getName() {
        return toString();
    }

    @Override
    public String toString() {
        return title + "\n" + text;
    }
}