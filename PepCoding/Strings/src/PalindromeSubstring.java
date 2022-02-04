import java.util.Scanner;

public class PalindromeSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        System.out.println(palindrome("mam")); ;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                if(palindrome(s.substring(i,j)))
                {
                    System.out.println(s.substring(i,j));
                }
            }
        }

    }
    public static boolean palindrome(String a) {
        if (a.length() == 1)
        {
            return true;
        }
        int i = a.length()-1;
        int j =0;
        while(i>=j)
        {
            if (!(a.charAt(i)==a.charAt(j))){
                return false;
            }
            i--;
            j++;

        }
        return true;


    }
}

