import java.util.Scanner;
//working like a champ
public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        for (int i=0;i<len;i++)
        {
            for(int j=i+1;j<=len;j++)
            {
                System.out.println(s.substring(i,j));
            }
        }
    }
}
