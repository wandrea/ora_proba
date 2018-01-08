package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //egyszeresen láncolt lista
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
       /* for (int i=0;i<10;i++){
            listOfNumbers.add(i);
        }
        for (int i=0; i<listOfNumbers.size(); i++){
            System.out.println(listOfNumbers.get(i));
        }*/
//kétszeresen láncolt lista
        LinkedList<String> nameList = new LinkedList<>();
        nameList.add("Béla");
        nameList.add("Józsi");
        nameList.add("Gréta");

        nameList.add(1,"Klára");
        for(String s : nameList){
            System.out.println(s);
        }


        //nincs duplikáció
        HashSet<Character> chars = new HashSet<>();
        chars.add('a');
        chars.add('a');
        chars.add('b');
        chars.add('c');

        for(Character c: chars){
            System.out.println(c);
        }
//kulcs-érték
      /*  HashMap<Integer, String> users = new HashMap<>();
        users.put(1, "Géza");
        users.put(2, "Béla");
        users.put(1, "Alma"); //itt módosítja a value-t a puttal!!


        //entry lokális változó?
        for(Map.Entry<Integer, String> entry : users.entrySet()){
            System.out.println("Key: "+ entry.getKey()+" Value: "+ entry.getValue());
        }
        */
        StringBuilder sb = new StringBuilder();
        //érdemesebb a String helyett használni, ha itt nem jön létre új objektum a memóriában azzal hogy
        //hozzáfűzünk a sima Stringnél viszont külön objektumok a memóriában.szerver oldali alkalmazásoknál fontos
        //megváltozatható a sima String nem megváltoztatható.
        sb.append("a");
        sb.append("b");
        sb.append("c");
        //sb.toString()  ez abc-t ad össze, összefűzi őket



        SacramentoUtil su = new SacramentoUtil();
        try {
            su.readSacramentoCSV();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

