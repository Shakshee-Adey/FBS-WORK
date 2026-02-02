package newFun;

import java.util.Comparator;

public class MySalaryComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		return (int) (e1.salary - e2.salary);
	}
	
	

}
