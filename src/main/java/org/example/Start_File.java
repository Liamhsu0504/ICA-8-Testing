package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Li Che Hsu
 * ASUrite: lhsu16
 * ASU ID: 1225397459
 */
public class Start_File {
    public static List<Integer> checking(List<String> data) throws IOException {
        int index = 0;
        List<Integer> ans = new ArrayList<>();
        while(!data.isEmpty()){
            String str = data.get(index);
            int[] space = new int[str.length() + 1];
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                space[i] = c - '0';;
            }
            int cnt = 0;
            for(int i = 0; i < str.length(); i++){
                if(space[i] == 1 && space[i + 1] == 1){
                    cnt = -1;
                    break;
                }
                if(space[i] == 1)
                    continue;
                int pre = i == 0 ? 0 : space[i - 1];
                int post = i == str.length() - 1 ? 0 : space[i + 1];
                if(pre == 0 && post == 0){
                    space[i] = 1;
                    cnt++;
                }
            }
            ans.add(cnt);
            data.remove(str);
        }
        outputAns.print(ans);
        return ans;
    }
}
