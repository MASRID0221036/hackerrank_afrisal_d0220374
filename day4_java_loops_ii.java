import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
                        int x = 1;
            int hasil = 0;
            
            for (int z = 0; z < n; z++) {
                if (0 == z) {
                    hasil = x * b;
                    hasil += a;
                    System.out.print(hasil + " ");
                } else {
                    hasil += x * b;
                    System.out.print(hasil + " ");
                }
                x += x;
            }
            System.out.println("");
        }
        in.close();
    }
}