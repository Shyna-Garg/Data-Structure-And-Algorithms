// to find if any number is repeating in given array

public class repitition {
  public static int repeat (int num[]){
    for (int i=0;i<num.length;i++){
      for (int j=i+1; j<num.length;j++){
        if(num[i]==num[j]){
          System.out.println(num[i]);
          return 1;
        }
      }
    }
    return 0;
  }
    public static void main(String[] args) {
      int num[]={1,2,3,4,5,3};
      int ans=repeat(num);
      if(ans==1){
          System.out.print("found repition");
      }
      else{
        System.out.print("All elements are distinct");
      }
  }
}