package OOPS;

/*static keyword -> is used to share the same variable or method of a class.
can share properties , methods , blocks , nested classes
fyda -> saves a lot of memory
exmpale - let say hm ek student class bna re h..toh sare students k liye name wgera different ho skta h pr school ka name toh same hi hoga toh 
hm ek baar school ka name define krenge or uske age static keword use kr denge toh hme sare classes k liye alg s string ni bnana prega which
saves lot of memory and sara kam ek bar m ho jyga
*/
public class StaticKeyword {
    public static void main(String[] args) {
       Student siddo = new Student();
       //here we are just intializing the value fro siddo's school..doesnot printing it
       siddo.schoolName = "DAV";
       Student chndn = new Student(); 
       //here we are not intializing any value for chndn..just printing the schoolName without declaring it for chndn..amd yes it will print
       // DAV. bcz of static keyword
       System.out.println(chndn.schoolName);
       //creating third student object and changing the value of schoolName and it changes schoolname for students
       Student shyu = new Student();
       shyu.schoolName= "ABC";
       System.out.println(siddo.schoolName);
       System.out.println(chndn.schoolName);
    }
}

class Student{
    String name;
    int roll;
    //static variable
    static String schoolName;
    
}

/*
  Output ->
  DAV
  ABC
  ABC
 */