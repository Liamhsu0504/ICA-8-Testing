package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
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
    File doc = new File("/Users/liam0504/Desktop/ICA-8/src/data/urinal.dat");
    public static List<String> data = new ArrayList<>();
    @Test
    void FileExists(){
        assertTrue(doc.exists());
    }
    @Test
    void EmptyFile(){
        inputdata.scrap(data);
        assertFalse(data.isEmpty());
    }
    @Test
    void NumberFormatException(){
        data = new ArrayList<>();
        inputdata.scrap(data);
        int index = 0;
        boolean test = true;
        while(!data.isEmpty()){
            String str = data.get(index);
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(c != '0' && c != '1')
                    test = false;
            }
            data.remove(str);
        }
        assertTrue(test);
    }
    @Test
    void FileisDuplicate() throws IOException {
        data = new ArrayList<>();
        inputdata.scrap(data);
        int index = 0;
        boolean test = true;
        while(!data.isEmpty()){
            String str = data.get(index);
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(c != '0' && c != '1')
                    test = false;
            }
            data.remove(str);
        }
        assertTrue(test);
    }
    @Test
    void BadFilename() throws IOException {
        data = new ArrayList<>();
        inputdata.scrap(data);
        File myObj = new File("rule.txt");
        int count = 0;
        String str = "rule.txt";
        while (!myObj.createNewFile()) {
            StringBuilder stringBuilder = new StringBuilder();
            count++;
            stringBuilder.append("rule" + count + ".txt");
            str = stringBuilder.toString();
            myObj = new File(str);
        }
        Boolean test_rule = str.contains("rule");
        Boolean test2_txt = str.contains(".txt");
        assertTrue(test_rule && test2_txt);
    }
    @Test
    void Urinal_StringIsNull(){
        data = new ArrayList<>();
        inputdata.scrap(data);
        int index = 0;
        boolean test = true;
        while(!data.isEmpty()){
            String str = data.get(index);
            if(str == null) test = false;
            data.remove(str);
        }
        assertTrue(test);
    }
}
