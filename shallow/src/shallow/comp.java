package shallow;

import java.util.Comparator;

public class comp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		emp e1=(emp)o1;
		emp e2=(emp)o2;
		if(e1.age>e2.age)
			return -1;
		else if(e1.age<e2.age)
			return 1;
		return 0;
	}
	

}
