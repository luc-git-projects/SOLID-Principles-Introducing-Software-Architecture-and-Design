package singlereponsibilityprinciple.rightway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeRepository {

    public void save(Employee employee){
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
            
            int i = 1;
            String query = "INSERT INTO employee (id, name, address, cellPhone, type) VALUES (?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(i++, employee.getId());
            preparedStatement.setString(i++, employee.getName());
            preparedStatement.setString(i++, employee.getAddress());
            preparedStatement.setString(i++, employee.getCellPhone());
            preparedStatement.setString(i++, employee.getType());
            
            
            preparedStatement.executeUpdate();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(singlereponsibilityprinciple.wrongway.Employee.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}