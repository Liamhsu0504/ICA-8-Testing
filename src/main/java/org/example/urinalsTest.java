package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

/**
 * @author Li Che Hsu
 * ASUrite: lhsu16
 * ASU ID: 1225397459
 */
public class urinalsTest {
     File doc = new File("/Users/liam0504/Desktop/ICA-8/src/data/urinals.dat");
    public static List<String> data = new ArrayList<>();
    @Test
    void FileExists(){
        assertThrows(IllegalArgumentException.class,
                () ->{
                    inputdata.scrap(data);
                });
    }
}
