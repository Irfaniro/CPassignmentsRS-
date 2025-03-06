import java.util.ArrayList;
import java.util.Arrays;
public class TestT{
  public static void main(String [] args){
    ArrayList<Integer>tester= new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
 int rightm=tester.size()-1;
 int leftm=0;
 int maxarea=0;
 while (leftm<rightm){
   int width=rightm-leftm;
   int height=Math.min(tester.get(leftm),tester.get(rightm));
   maxarea=Math.max(maxarea,width*height);
   if(tester.get(leftm)<tester.get(rightm)){
     leftm++;}
     else{
       rightm--;}}
     System.out.println(maxarea);
  }
}
/*
we take two int as pointers for the indexes .While the leftmost is smaller than the rightmost, we find the width by subtracting the rightmost index from the leftmost index and the height as whichever 
has the smaller value. Then we use a MAXvalue funtion and check the volume each time with the values we get until the loop ends and print the stored highest value. 
*/
