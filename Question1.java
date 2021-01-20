import java.util.ArrayList;

class Question1 {

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

            

        }}
        return code;
    }

   public static void main (String[] args) {
        ArrayList<Integer> prime = prime(100);
        System.out.println(prime);
    }

}