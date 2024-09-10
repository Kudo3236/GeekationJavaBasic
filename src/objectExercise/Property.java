package objectExercise;

public class Property {

	//インスタンスフィールド
	private String name;
	private String owner;
	private String type;
	private int price;
	
	//コンストラクタ
	public Property(String name,String owner,String type,int price) {
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.price = price;
	}
	
	//ゲッターとセッターの実装
	public String getname() {
		return this.name;
	}
	
	public String getowner() {
		return this.owner;
	}
	
	public String gettype() {
		return this.type;
	}

	public int getprice() {
		return this.price;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setowner(String owner) {
		this.owner = owner;
	}
	
	public void settype(String type) {
		this.type = type;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
	
	//出力処理
	public void print() {
		System.out.println("=============================");
		System.out.println("物件名：" + name);
		System.out.println("物件所有者名：" + owner);
		System.out.println("物件種別：" + type);
		System.out.println("物件価格：" + price + "円");
	}
}
