package arrayList;

public class MobilePhone implements Comparable<MobilePhone> {
	
	String name;
	float cost;
	int rating;
	
	
	public MobilePhone(String name, float cost, int rating) {
		this.name = name;
		this.cost = cost;
		this.rating = rating;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "MobilePhone name=" + name + ", cost=" + cost + ", rating=" + rating;
	}


	@Override
	public int compareTo(MobilePhone o) {
		// TODO Auto-generated method stub
		return this.rating - o.rating;
	}
	
	

}
