package Aug_25;
class Armstrong {
    public static void number(int n){
        int count=0, temp=n,sum=0;
        while(temp!=0){
        	count++;//3
        	temp/=10;
        		   
        }
        temp=n;//153
        while(temp!=0){
        	int t=temp%10;//5
       sum+=(int)Math.pow(t,count);//27+125+1
        		temp=temp/10;  //1  
        }
        if(sum==n)
        System.out.println("SAm"+sum);
        else {
        	System.out.println(sum);
        }
       
    }
    public static void main(String[]args){
        number(153);
    }
}


















