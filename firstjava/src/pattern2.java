import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args){
        Scanner jan=new Scanner(System.in);
        System.out.println("enter rows");
        int rows=jan.nextInt();
        int r=1;
        int star=1;
        int space=rows-1;
        while(r<=2*rows-1){
            for(int c1=1;c1<=space;c1++){
                System.out.print(" ");
            }
            for(int c2=1;c2<=star;c2++){
                System.out.print("*");
            }
            System.out.println();
            r++;
         if(r<rows){
             star=star+2;
             space--;
         }
         else{
             star=star-2;
             space++;
         }
        }
    }
}
