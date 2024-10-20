package org.skypro.skyshop.search;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

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
                if (count > 4) {
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
