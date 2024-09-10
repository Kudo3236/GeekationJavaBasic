package objectExercise;

public class Apartment extends Property{
	private String layout;
		
	public Apartment(String name,String owner,String type,int price,String layout) {
		super(name,owner,type,price);
		this.layout = layout;
	}
	
	public String getlayout() {
		return this.layout;
	}
	
	public void setlayout(String layout) {
		this.layout = layout;
	}
		
	public void print() {
		super.print();
		System.out.println("間取り：" + layout);
		System.out.println("=============================");
	}
}

