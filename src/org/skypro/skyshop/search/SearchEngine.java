package org.skypro.skyshop.search;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

import org.skypro.skyshop.model.Searchable;

public class SearchEngine {

    private final Searchable[] elements;

    public SearchEngine(int size) {
        elements = new Searchable[size];
    }

    public Searchable[] search(String string) {
        int count = 0;
        Searchable[] searchables = new Searchable[5];
        for (Searchable element : elements) {
            if (nonNull(element) && element.searchTerm().contains(string)) {
                searchables[count] = element;
                count++;
                if (count >= searchables.length) {
                    break;
                }
            }
        }
        return searchables;
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
