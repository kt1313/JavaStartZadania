package JavaStartZadania;

import java.util.Scanner;

public class Zad18_Tree implements Zad18_Drawable{
    int h, empties,stars;
    @Override
    public void draw() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj wysokość:");
        h=sc.nextInt();
        empties=h-1;
        stars=1;
        for (int i=0;i<h;i++){
            for(int j=0;j<empties;j++)System.out.print(' ');
            for(int k=0;k<stars;k++)System.out.print('*');
            for (int l=0;l<empties;l++) System.out.print(' ');
            empties--;
            stars+=2;
            System.out.println();
        }
        sc.close();

    }
}
