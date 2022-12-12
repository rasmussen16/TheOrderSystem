import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDAL {
	
	private ArrayList<Product> products; 
	private Connection connection = null; 
	private Statement statement = null; 
	private PreparedStatement prepStatement = null; 
	private ResultSet resultSet = null; 
	
	public ProductDAL() { 
		products = new ArrayList<>();
	}
		
	// gets all records from products table 
	
	public ArrayList<Product> getAll(){
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/shoestore","root","root");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("Select * from products");
			
			while (resultSet.next()) { 
				System.out.println(resultSet.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return products; 
}

// add products to the database 
	public void addProduct(Product p) {
	if (p !=null) { 
		products.add(p);
	}
} 

	public ArrayList<Product> searchByName(String name){ 
	 ArrayList<Product> results = new ArrayList<>();
	if (products !=null) {
		
		// loop through all products 
		for (Product product : products) { 
			if (product.getName().contains(name)) { 
				results.add(product);
			}
		}
	} 

		return results; 
	}
	public void printAll() { 
 	for (Product product : products) { 
 		System.out.println(product.getName() + " " + product.getProductID());
 		
 		}
	}
}




