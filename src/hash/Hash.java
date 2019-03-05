package hash;

import java.util.HashMap;
import java.util.Map;

public class Hash {

    public void solution() {

        String participant[] = {"hyen", "bogum", "zico"};
        String completion[] = {"zico", "hyen"};

        String answer = "";

        Map<Integer, String> phash = new HashMap();
        Map<Integer, String> chash = new HashMap();

        Integer num = 0;

        for (String name : participant){
            phash.put(num++, name);
        }

        Integer num1 = 0;

        for (String name : completion){
            chash.put(num1++, name);
        }

        for(int i=0; i<participant.length ; i++){
            if( ! chash.containsValue(phash.get(i)) ){
                answer = phash.get(i);
            }
        }

        System.out.println(answer);
    }
}
