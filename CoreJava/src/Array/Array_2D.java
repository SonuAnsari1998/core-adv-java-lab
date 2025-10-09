package Array;
//sonu
public class Array_2D {
    public static void main(String[] args) {
        int[] [] x=new int[2][3]; // declaration, creation
        int [][] y= {{10,20,30},{40,50,60}}; //declaration,creation,initialization, in one line
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
    }
}