import java.util.ArrayList;

class Question2 {

    public static ArrayList<Integer> prime( int l ) {

        ArrayList<Integer> code = new ArrayList<Integer>();
        for(int i=2; i<=l;i++){
            code.add(i); 
        }

        for(int n=2;n<5;n++){
            for(int j=2;j<code.size();j++){
                if(code.get(j)%n==0){
                    code.remove(j);
                    j--;
                }


            }
        }
        return code;
    }

    public static void goldbachSum(int n) {
        ArrayList<Integer> primes = prime(n);
        for(int i=0;i<primes.size();i++){
            int one=primes.get(i);
            int two=n-primes.get(i);
            int three=one+two;
            if(primes.contains(two)){
             System.out.println(one+"+"+two+"="+three);
             return;
           }
        }
           
               
        
       
    }
    
    
    public static void main (String[] args) {
        for(int i=4;i<=100;i+=2){
            goldbachSum(i);
        }
    }

}