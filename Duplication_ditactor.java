import java.util.*;  
public class Duplication_ditactor{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
  LinkedHashSet<Character> set=new LinkedHashSet<Character>();  
  Scanner sc=new Scanner(System.in);
  String st=sc.nextLine();
  int length=st.length();
  for(int i=0;i<length;i++){
      set.add(st.charAt(i));
  }
  //Traversing elements  
  Iterator<Character> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.print(itr.next());  
  }  
 }  
 
}  