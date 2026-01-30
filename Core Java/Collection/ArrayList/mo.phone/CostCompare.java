package arrayList;

import java.util.Comparator;

public class CostCompare implements Comparator<MobilePhone> {

	@Override
	public int compare(MobilePhone o1, MobilePhone o2) {
		// TODO Auto-generated method stub
		return Float.compare(o1.getCost(), o2.getCost());
	}

}
