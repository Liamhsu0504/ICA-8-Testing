package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Li Che Hsu
 * ASUrite: lhsu16
 * ASU ID: 1225397459
*/
public class urinals {
    public static List<String> data = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        Scanner sc= new Scanner(System.in);
        System.out.print("Please input the number for what input do you want to choose?\n" +
                "1: keyboard 2: file ");
        String str= sc.nextLine();              //reads string
        if(str.equals("1")){
            Scanner key= new Scanner(System.in); //System.in is a standard input stream
            System.out.print("Please input urinals: ");
            data.add(key.nextLine());
            Start_Keyboard.checking(data);
        }
        else{
            inputdata.scrap(data);
            Start_File.checking(data);
        }
    }
}