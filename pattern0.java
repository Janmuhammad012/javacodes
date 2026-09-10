import java.util.Scanner;

public class pattern0 {
    public static void main(String[] args){
        System.out.println("enter eny number to printf a pattern");
        Scanner jan=new Scanner(System.in);
        int row=jan.nextInt();
        int r=1;
        int star=1;
        while(r<=row){
            for(int c=1;c<=star;c++){
                System.out.print("*");

            }
            System.out.println();
            star++;
            r++;
        }


    }
}
