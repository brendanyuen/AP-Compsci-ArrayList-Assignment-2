import java.util.ArrayList;

class Question3 {

    public static ArrayList<Integer> add( ArrayList<Integer> a,ArrayList<Integer> b) {

        ArrayList<Integer> code = new ArrayList<Integer>();
        int carry=0;
        int i=a.size()-1;
        int j=b.size()-1;
        while(i>=0||i>=0){
            int sum=0;
            if(i>=0&&j>=0){
                sum=a.get(i)+b.get(j)+carry;   
            }
            else if(i>=0){
                sum=a.get(i)+carry;
            }
            else if(j>=0){
                sum=b.get(j)+carry;
            }
            else{
                sum=carry;
            }
            if(sum>9){
                carry=1;
                sum-=10;
            }
            else{ 
                carry=0;
            }
            code.add(0,sum);
            i--;
            j--;

        }
        if(carry>0){
            code.add(0,1);   
        }
        return code;
    }

    public static void main (String[] args) {
        ArrayList<Integer> one = new ArrayList<Integer>();
        one.add(1);
        one.add(1);
        one.add(1);
        one.add(9);
        ArrayList<Integer> two = new ArrayList<Integer>();
        two.add(1);
        two.add(1);
        two.add(1);
        two.add(9);
        ArrayList<Integer> three = add(one,two);
        System.out.println(three);
    }

}