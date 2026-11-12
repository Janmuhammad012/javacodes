package patterns;

import java.util.Scanner;
public class numberpattern {

    public static void main(String[] args){
        Scanner jan=new Scanner(System.in);
        int rows=jan.nextInt();


        for(int i=1;i<=rows;i++){
            int space=rows-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            for(int c=1;c<=i;c++){
                System.out.print(i+" ");

            }
            System.out.println();


        }



    }

}
