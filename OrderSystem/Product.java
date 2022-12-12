public class Product {
	private int ProductID; 
	private String name; 
	private String description;  
	private float cost;
	
	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Product(String name, String description, float cost) {
		super();
		this.name = name;
		this.description = description;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [ProductID=" + ProductID + ", name=" + name + ", description=" + description + ", cost=" + cost
				+ "]";
	} 
}
	
	



