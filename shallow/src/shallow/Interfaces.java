package shallow;
import java.util.Arrays;
import java.util.Comparator;
class emp
	{
		String name;
	int age;
	emp(String s,int a){
		name=s;
		age=a;
	}
	
	
}
public class Interfaces {
      @SuppressWarnings("unchecked")
	public static void main(String args[])
{
          emp e=new emp("kalai",23);
          emp e1=new emp("vana",25);
          emp e2=new emp("ari",19);
          emp em[]= {e,e1,e2};
          comp c=new comp();
          Arrays.sort(em,c);
          for(emp e0:em) {
        	  System.out.println(e0.age);
          }
         


}
}

