import java.io.*;
import java.util.*;

public class App {
                                    
    private static File f = new File("C:\\Users\\lorenzo.panizzolo\\Desktop\\Airlines_List\\src\\dati.txt");
    private static File f2 = new File("C:\\Users\\lorenzo.panizzolo\\Desktop\\Airlines_List\\src\\Passeggeri.txt");

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(f);
        Scanner in2 = new Scanner(f2);
        LineeAeree a = new LineeAeree();
        Volo b = new Volo();
        String split[][] = new String[100][100];
        String riga, riga2;
        int i = 0;
        int count = 0;

        while (in.hasNextLine()) {
            riga = in.nextLine();
            split[i] = riga.split(" ");
            a.add(i,new Volo(split[i][0], split[i][1], split[i][2], split[i][3], split[i][4], split[i][5]));
            i++;
        }

        for(int j = 0; j < a.getSize(); j++){
            in2 = new Scanner(f2);
            String split2[] = new String[100];
            i=0;
            while(in2.hasNextLine()) {
                riga2 = in2.nextLine();
                split2 = riga2.split(" ");
                if(a.getVolo(j).getCode().equals(split2[0])){
                    a.getVolo(j).addP(i, new Passeggeri(split2[0], split2[1], split2[2]));
                    i++;
                }
            }             
            in2.close();
        }

        for(int j = 0; j < a.getSize(); j++){
            System.out.println(a.getVolo(j));
            for(int k = 0; k < a.getVolo(j).getSize(); k++ ){
                System.out.println(k+ "->" + a.getVolo(j).getPasseggeri(k).toString());
            }
        } 

        //b.addP(30, new Passeggeri("AZ234", "LELE", "ADANI"));

    }
}