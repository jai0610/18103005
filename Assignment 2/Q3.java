import java.util.*;
public class Q3 {
		public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
String original = sc.next();
int j=0;
char temp=0;
 int index=0;
  char[] chars = original.toCharArray();
 //System.out.println(chars.length);
  for (int i = 0; i <chars.length-1; i++) {
      index=i;
 
      for ( j = i+1; j < chars.length; j++) {
 
       if(chars[j]<chars[index]){
           index=j;
            
       }}
       //System.out.print(index + " ");
       temp=chars[index];
           chars[index]=chars[i];
           chars[i]=temp;
 
   }  
 

 
for(int k=0;k<chars.length;k++){
System.out.print(chars[k]);
}
 
}
 
 

}