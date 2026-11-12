package patterns;

import java.util.Scanner;

public class butterfly {
    public static void main(String[] args){
        Scanner jan=new Scanner(System.in);
        System.out.println("enter rows");
        int rows=jan.nextInt();
        int star=1;
        //stars
        for(int i=1;i<=4;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            int space=2*(rows-i);

            //for spaces
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            star++;



        }






    }


}
