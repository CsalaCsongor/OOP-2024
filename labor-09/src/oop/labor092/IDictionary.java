package oop.labor092;

public interface IDictionary {
    String DICTIONARY_FILE = "dict.txt";

    boolean add(String word);
    boolean find(String word);
    int size();



}
