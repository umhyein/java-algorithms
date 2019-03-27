package hash;

import java.util.*;

public class Hash {

    public void marathon() {

        String participant[] = {"hy", "hy", "hi", "yj"};
        String completion[] = {"hy", "hi", "yj"};

        String answer = "";

        String participantNew[] = Arrays.stream(participant).distinct().toArray(String[]::new);


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


        if(answer.isEmpty()){
            for(int j =0; j<participantNew.length ; j++) {
                if(participant[j].equals(participantNew[j])){
                    answer = participant[j];
                }
            }
        }

        System.out.println("what");

    }

    public void phoneBook(){
        String phoneBook1[] = {"119", "97674223", "1195524421"};
        String phoneBook2[] = {"123", "456", "789"};
        String phoneBook3[] = {"12", "123", "1235", "567", "88"};

        boolean answer = true;

        Map<Integer, String> phoneHash = new HashMap();

        Integer num = 0;
        List<Boolean> result = new ArrayList<>();

        for(String phoneNum : phoneBook1){
            phoneHash.put(num++, phoneNum);
        }


        for(String pnum : phoneBook1){
            for(int i=0 ; i < phoneBook1.length ; i++){
                if(! pnum.equals(phoneHash.get(i))){
                    result.add(!(phoneHash.get(i).contains(pnum)));
                }
            }
        }

        if(result.contains(false)) answer = false;

        System.out.println(answer);
    }

    public void mask(){
        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};

        int answer = 0;

        Map<String, String> clothMap = new HashMap<>();
        List<String> allClothes  = new ArrayList<>();
        Set<String> clothCategory = new HashSet<>();

        for(String[] cloth : clothes){
            String[] clothesList = cloth;
            clothMap.put(clothesList[0], clothesList[1]);
            allClothes.add(clothesList[0]);
            clothCategory.add(clothesList[1]);
        }

        Map<String,Integer> report = new HashMap<>();
        List<String> clothList = new ArrayList<>();
        Iterator<String> iteratorSet = clothCategory.iterator();

        while (iteratorSet.hasNext()){
            String clothName = iteratorSet.next();
            Integer num = 0;
            for(String cloth : allClothes){
               if(clothName.equals(clothMap.get(cloth))){
                   ++num;
                }
            }
            report.put(clothName, num);
            clothList.add(clothName);
        }


        for(int j=1; j<clothList.size()+1; j++){
            if(clothList.size()+1 <= 1){

            }else{
                Math.
            }
            answer =+ report.get(clothList.get(j));
            Math.
        }



    }
}
