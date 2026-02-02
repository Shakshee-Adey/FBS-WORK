package newFun;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.id - o2.id;
	}
	
	

}
