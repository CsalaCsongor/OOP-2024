package oop.labor092;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary {

    private ArrayList<String> dictionary;

    private static ArrayListDictionary instance;

    public ArrayListDictionary() {
      dictionary  =  new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(DICTIONARY_FILE))) {
            while (scanner.hasNextLine())
            {
                dictionary.add(scanner.nextLine());
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static ArrayListDictionary getInstance()
    {
        if(instance == null)
        {
            instance = new ArrayListDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String word) {
        dictionary.add(word);
        Collections.sort(dictionary);
        return true;
    }

    @Override
    public boolean find(String word) {
        return Collections.binarySearch(dictionary, word) >= 0;
    }

    @Override
    public int size() {
        return dictionary.size();
    }
}
