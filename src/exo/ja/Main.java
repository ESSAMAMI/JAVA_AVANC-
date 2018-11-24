package exo.ja;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void readFileSum(String path){

        Instant start = Instant.now();
        try {
            int sum = 0;
            ArrayList<String> arrayList;
            arrayList = new ArrayList<String>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while(bufferedReader.readLine() != null){

                String[] st = bufferedReader.readLine().split(":");
                arrayList.add(st[1]);
            }
            for (String str: arrayList){

                int value = Integer.parseInt(str);
                sum += value;
            }
            System.out.println("SUM => "+(sum / arrayList.size()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Duration duration = Duration.between(start, Instant.now());
        int nano = duration.getNano();
        long durMs = TimeUnit.MILLISECONDS.convert(nano, TimeUnit.NANOSECONDS);
        System.out.println("RUN TIME MS : " +durMs);
    }

    public static void readFileFoundByEmail(String path, String email){
        Instant start = Instant.now();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            Boolean bol = false;
            int cnt = 0;
            while(bufferedReader.readLine() != null || bol == true){

                String [] strings = bufferedReader.readLine().split(":");
                if(strings[0].equals(email)){
                    System.out.println("\nNOTE : " + strings[1]);
                    cnt ++;
                    break;
                }
            }
            if(cnt == 0){

                System.out.println("RESULT NOT FOUND");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Duration duration = Duration.between(start, Instant.now());
        int nano = duration.getNano();
        long durMs = TimeUnit.MILLISECONDS.convert(nano, TimeUnit.NANOSECONDS);
        System.out.println("RUN TIME MS : " +durMs);
    }

    public static void main(String[] args) {

        System.out.println("================= EXERCICE 1 - SWAP =================");
        System.out.println("================= AVANT SWAP =================");
        double [] a = {10,20,30};
        double [] b = {40,50,60};
        System.out.println(a);
        System.out.println(b);

        System.out.println("================= APRES SWAP =================");
        double [] x = a;
        a = b;
        b = x;
        System.out.println(a);
        System.out.println(b);


        System.out.println("================= EXERCICE 2 - STRING BUILDER =================");
        StringBuilder [] sbTab ;
        sbTab = new StringBuilder[10];
        for (int i =0; i < sbTab.length; i++ ){
            sbTab[i]= new StringBuilder("Hello");
            System.out.println("=====> "+sbTab[i]);
        }

        System.out.println("================= EXERCICE 2 - BUFFER READER =================\n");
        readFileSum("D:/Projet/src/exo/util/exo1.txt");
        readFileFoundByEmail("D:/Projet/src/exo/util/exo1.txt", "geekoid@att.net");



    }

}
