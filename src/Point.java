/**
 * Created by oreli on 27.04.2016.
 */
public class Point {
    public int x;
    public int y;
    public char sym;
    public void Draw(int x, int y, char sym){
        for(int i = 0; i<y;i++){
            System.out.println();
            for(int j=0;j<x;j++){
                System.out.print(" ");
            }
        }
        System.out.println(sym);

    }
}
