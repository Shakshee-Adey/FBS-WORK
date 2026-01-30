package arrayList;

import java.util.Comparator;

public class NameCompare implements Comparator<MobilePhone> {

	@Override
	public int compare(MobilePhone o1, MobilePhone o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
