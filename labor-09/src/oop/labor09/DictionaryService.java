package oop.labor09;

import oop.labor092.IDictionary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.File;


public class DictionaryService{

    IDictionary dictionary;
    public List<String> findWordsFile(String filename)
    {
        List<String> unknowWords = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File (filename))) {
            while(scanner.hasNextLine())
            {
                String word = scanner.next();
                if(!dictionary.find(word))
                {
                    unknowWords.add(word);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


}
