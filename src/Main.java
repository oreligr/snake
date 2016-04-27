import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Draw(2,3,'*');
        Draw(3,4,'-');

    }
    static void Draw(int x, int y, char sym){
        for(int i = 0; i<y;i++){
            System.out.println();
            for(int j=0;j<x;j++){
                System.out.print(" ");
            }
        }
        System.out.println(sym);
       
    }
}
