package org.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Li Che Hsu
 * ASUrite: lhsu16
 * ASU ID: 1225397459
*/
public class urinals {
    public static List<String> data = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        inputdata.scrap(data);
        System.out.print(data);
    }
    static Boolean printString(String str) {  // checks to see if valid string
        System.out.println ("Not yet implemented");
        return true;
    }

}