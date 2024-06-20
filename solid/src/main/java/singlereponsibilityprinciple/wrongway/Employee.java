package singlereponsibilityprinciple.wrongway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Employee {

    private Integer id;
    private String name;
    private String address;
    private String cellPhone;
    private String type;
    
    public void save(){
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
            
            int i = 1;
            String query = "INSERT INTO employee (id, name, address, cellPhone, type) VALUES (?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(i++, this.id);
            preparedStatement.setString(i++, this.name);
            preparedStatement.setString(i++, this.address);
            preparedStatement.setString(i++, this.cellPhone);
            preparedStatement.setString(i++, this.type);
            
            
            preparedStatement.executeUpdate();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double calculateTax(){
        
        if(this.type.equals("fulltime")){
            return 15.0;
        }
        
        if(this.type.equals("contract")){
            return 18.5;
        }
        return 0.0;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getType() {
        return type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}