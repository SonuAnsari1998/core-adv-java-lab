package Aug_25;
class test {
	
	    public static void main(String[]args){
	    	int fn=100,ln=200;
	        for(int i=fn; i<=ln; i++){
	            int temp=i;
	            int rev=0;
	            while(temp!=0){
	            int rem=temp%10;
	            rev=rev*10+rem;
	            temp/=10;   
	        }
	        
	        if(i==rev) {
	        	System.out.println(i);
	        }
	        
	    }
	        }
	        }

	    		
	    
	
