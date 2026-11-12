package patterns;

import java.util.Scanner;

public class patter5 {

    public static void main(String[] arges){

        Scanner jan=new Scanner(System.in);
        int rows=jan.nextInt();

        int star=5;




        for(int r=1;r<=rows;r++) {
            int space=rows-r;
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }

            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
          //  space--;

        }






    }





}
