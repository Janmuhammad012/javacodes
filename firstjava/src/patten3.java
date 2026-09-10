import java.util.Scanner;

public class patten3 {
    public void main(String[] args){
        Scanner jan=new Scanner(System.in);
        System.out.println("entr rows");
        int rows=jan.nextInt();
        int r=1;
        int star=1;
        int space =rows-1;
        while(r<=rows){
            for(int c1=1;c1<=space;c1++){
                System.out.print(" ");
            }
            for(int c2=1;c2<=star;c2++){
                System.out.print(" *   ");

            }
            System.out.println();
            r++;
            star++;
            space--;
        }
    }
}
