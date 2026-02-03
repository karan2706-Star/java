import java.util.Scanner;
class palindrome{
  public static void main(string arg[])
  {
    Scanner num=new Scanner(System.in);
    System.out.println("Enter any number");
    x=num.nextInt();
    int y=x;
    int rev=0;
    while(x>0)
      {
        rev=(rev*10)+x%10;
        x=x/10;
      }
    if(y==rev){
      System.out,println("Palindrome number");
    }
    else{
      System.out.println("Not palindrome");
    }
  }
}
