import java.util.*;
public class CodingPractice{
    public static void main(String[]args){
        ArrayList<Integer> multiplesOf3=new ArrayList<>();
        for(int i=0;i<100;i++){
            int x=3*i;
            multiplesOf3.add(x);
        }
        System.out.println(multiplesOf3);
        for(int n=0;n<multiplesOf3.size();n++){
            if(multiplesOf3.get(n)%2==0){
                multiplesOf3.remove(n);
            }
        }
        System.out.println(multiplesOf3);
    }
}