package org.example;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();
    // method push: add url to urls.
    /*test test test test
     * test test test
     */
    public void push(String url){
        urls.add(url);
    }
    public String pop(){
        return urls.remove(urls.size()-1);
    }

    public Iterator createIterator(){
        return new ListIterator(this);
    }
    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
    public class ListIterator implements Iterator{
        private BrowseHistory history;
        private int index;
        public ListIterator(BrowseHistory history){
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return (index<history.urls.size());
        }

        @Override
        public Object current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
