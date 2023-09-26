package shallow;
class arr{
	void a(int a[]) {
		a[0]=10;
		System.out.println(a[0]);
	}
}
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="kalaivanan";
		s1.concat("S");
		System.out.println(s1);
		StringBuffer s=new StringBuffer("Hello");
		s.append("world");
		System.out.println(s);
		StringBuffer s2=new StringBuffer("kalaifullstack");
		s2.insert(14,"developer");
		System.out.println(s2);
		StringBuffer s3=new StringBuffer("Kalaivanann");
		s3.replace(0, 2, "Hai");
		System.out.println(s3);
      StringBuffer s4=new StringBuffer("kalaivanan");
      s4.delete(0, 2);
      System.out.println(s4);
      StringBuffer o=new StringBuffer("Hello");
      o.reverse();
      System.out.println(o);
     int a[]= {
    		 1,2,3,45
     };
     for(int i:a) {
    	 System.out.println(i);
     }

          }

}
