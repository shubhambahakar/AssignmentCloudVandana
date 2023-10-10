import java.util.*;
class Pangram
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the String to Check: ");
    String name = sc.nextLine();

    int[]checkArr = new int[26];
    String str = name.toLowerCase(); 

    for(int i = 0; i < str.length(); i++)
    {
      if(str.charAt(i) != 36 && str.charAt(i) >= 97 && str.charAt(i) <= 122)
      {
        checkArr[str.charAt(i) - 97] = 1; 
      }
    }

    for(int i = 0; i < 26; i++)
    {
      if(checkArr[i] != 1)
      {
        System.out.println("It is Not Pangram ");
        System.exit(0);
      }
    }

    System.out.println("It is a Pangram ");
  }
}