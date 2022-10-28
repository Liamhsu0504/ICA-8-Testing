package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 * @author Li Che Hsu
 * ASUrite: lhsu16
 * ASU ID: 1225397459
 */

public class inputdata {
    public static Scanner obj = null;
    public static  File doc;

    public static void scrap(List<String> data) {
        doc = new File("/Users/liam0504/Desktop/ICA-8/src/data/urinals.dat");
        try {
            obj = new Scanner(doc);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
        while (obj.hasNext()){
            if(obj.hasNextLine()){
                data.add(obj.nextLine());
            }
        }
    }
}
