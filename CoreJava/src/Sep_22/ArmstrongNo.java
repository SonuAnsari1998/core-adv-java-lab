package Sep_22;

/*Program 08 :
------------- 
Write a Java program to verify whether a number is armstrong or not where number must be taken from command line argument.*/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ArmstrongNo {
    public static void main(String[] args) {
       int num=Integer.parseInt(args[0]);
  
    int c=0;
    int dup=num;
    while(dup!=0)
    {
        c++;
        dup/=10;
    }
    dup=num;
    int sum=0;
    while(dup!=0)
    {
        int last=dup%10;
            int itr=1;
            for(int j=1; j<=c; j++)
            {
                itr=itr*last;
            }
            
            sum+=itr;
          dup/=10;  
    }
    
    if(sum==num)
    {
        System.out.println("ArmStrong");
    }
    else{
        System.out.println("not ArmStrong");
        
    }
    
    }
}



