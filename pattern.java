import java.util.Scanner;

public class pattern {
    public static void main(String[] arge){
        Scanner jan =new Scanner(System.in);
        System.out.println("enter rows");
          int rows = jan.nextInt();
          int r=1;
          int star=1;
          while(r<=2*rows-1){
              for(int c=1;c<=star;c++){
                  System.out.print("*   ");
              }
              System.out.println();
              r++;
              if(r<rows){
                  //r++;
                  star++;
              }
              else{
                 // r--;
                  star--;
              }
          }

    }
}
