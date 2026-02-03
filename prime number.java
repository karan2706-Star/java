import java.util.Scanner;
class prime{
  public static void main(string arg[])
    {
      Scanner num=new Scanner(System.in);
      System.out.println("Enter any number");
      x=num.nextInt();
      int count=0;
      for(int i=0;i<=x;i++){
        if(x%i==0){
          count++;
        }
      }
      if(count==2){
        System.out.println{"prime number");
                          }
        else{
        System.out.println("Not Prime");
      }
    }
}
      
    
