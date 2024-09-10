package objectExercise;

public class Land extends Property{
	private double size;
		
	public Land(String name,String owner,String type,int price,double size) {
		super(name,owner,type,price);
		this.size = size;
	}
	
	public double getsize() {
		return this.size;
	}
	
	public void setsize(double size) {
		this.size = size;
	}
		
	public void print() {
		super.print();
		System.out.println("広さ：" + size + "㎡");
		System.out.println("=============================");
	}
}
