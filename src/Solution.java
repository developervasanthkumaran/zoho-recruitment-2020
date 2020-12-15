import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Solution {

    void printPattern(int n){
        n+=1;
        int k = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(' ');
            }
            int x = i;
            while (x > 0){
                System.out.print((x--));
            }
            int y = 0;
            while (y <= i){
                System.out.print((y++));
            }
            for (int j = 0; j < k; j++) {
                System.out.print(' ');
            }
            System.out.println();
            k--;
        }
    }


    public static void main(String[] args) {
            FastReader reader = new FastReader();
            Solution solution = new Solution();
            int lines = reader.nextInt();
            solution.printPattern(lines);
    }
}

class FastReader
{
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException  e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}
