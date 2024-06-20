package dependencyinjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLProductRepository implements ProductRepository{
    
    
    @Override
    public List<String> getAllProducts(){
        
        Connection connection = null;
        Statement statement = null;
        List<String> productNames = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
            
     
            String query = "SELECT name FROM Product";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(query);
            
            
            while(resultSet.next()){
                String name = resultSet.getString("name");
                productNames.add(name);
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(singlereponsibilityprinciple.wrongway.Employee.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            return productNames;
        }
    }
}