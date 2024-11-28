import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String v[];
        v=new String [5];
        v[0]="matt";
        v[1]="paky";
        v[2]="amy";
        v[3]= "bono";
        v[4]=" mario";
        int i;
        i=0;
        while(i<5){
            System.out.println("scrivi v[i]");
            i++;
        }
        String w[];
        w= new String[5];
        while(i<5){
            System.out.println("scrivi w[i]");
            i++;
        }
        i=0;
        for (i=0; i<5; i++){
            System.out.println("inserire il nome del canatnte");
            w[i]= scanner.nextline();

        }
        int x[];
        x= new int[10];
        while(i<10){
            System.out.println("x[i]");
            System.out.println("il contenuto degli indici pari sono");
            System.out.println("x[2]");
            System.out.println("x[4]");
            System.out.println("il contenuto degli indici dispari sono");
            System.out.println("x[1]");
            System.out.println("x[3]");
            System.out.println("x[5]");
        }
        i=0;
        for( i=0; i<10; i++){
            x[i]= scanner.nextInt();
        }
        int y[];
        y= new Int [10];
        while(i<10){
            System.out.println(" y[i]");
            i++;
        }
        int resto;
        int i;
        resto=0;
        i=0;
        for(i=0;i<10;i++){
            y[i]=resto/2;
        }
//LEGGERE LE ISTRUZIONI NEL FILE README.md