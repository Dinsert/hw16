package org.skypro.skyshop.service;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

import org.skypro.skyshop.model.Searchable;

public class SearchEngine {

    private static final int MAX_SEARCH_RESULTS = 5;

    private final Searchable[] elements;

    public SearchEngine(int size) {
        elements = new Searchable[size];
    }

    public Searchable[] search(String string) {
        int count = 0;
        Searchable[] searchResult = new Searchable[MAX_SEARCH_RESULTS];
        for (Searchable element : elements) {
            if (nonNull(element) && element.searchTerm(string)) {
                searchResult[count++] = element;
                if (count >= MAX_SEARCH_RESULTS) {
                    break;
                }
            }
        }
        return searchResult;
    }

    public void add(Searchable searchable) {
        for (int i = 0; i < elements.length; i++) {
            if (isNull(elements[i])) {
                elements[i] = searchable;
                break;
            }
        }
    }
}
