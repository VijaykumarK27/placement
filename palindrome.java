public class palindrome {
    public static void main(String args[]){  
        int rev=0;
        int rem;   
        int num=12321;//It is the number variable to be checked for palindrome  
        int temp=num; 

        while(num > 0){    
         rem=num % 10;  //getting remainder  
         rev=(rev * 10)+rem;    
         num=num / 10;    
        }    
        
        if(rev==temp)    
         System.out.println("palindrome number");    
        else    
         System.out.println("not palindrome");    
      }  
       
}
