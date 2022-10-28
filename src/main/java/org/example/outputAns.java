package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @author Li Che Hsu
 * ASUrite: lhsu16
 * ASU ID: 1225397459
 */
public class outputAns {
    static int count = 0;
    public static void print(List<Integer> ans) throws IOException {
        File myObj = new File("rule.txt");
        String str = "";
        myObj.createNewFile();
        /*while (!myObj.createNewFile()) {
            StringBuilder stringBuilder = new StringBuilder();
            count++;
            stringBuilder.append("rule" + count + ".txt");
            str = stringBuilder.toString();
        }*/
        FileWriter myWriter = new FileWriter("rule.txt");
        for(int i = 0; i < ans.size(); i++){
            String s = ans.get(i).toString();
            myWriter.write(s + '\n');
        }
        myWriter.close();
    }
}
