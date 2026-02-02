package newFun;

import java.util.Comparator;

public class MyNameComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);
	}

}
