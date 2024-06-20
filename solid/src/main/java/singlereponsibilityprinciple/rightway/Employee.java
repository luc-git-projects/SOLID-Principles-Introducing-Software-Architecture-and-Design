package singlereponsibilityprinciple.rightway;

public class Employee {

    private Integer id;
    private String name;
    private String address;
    private String cellPhone;
    private String type;
    
    
    public void save(){
        new EmployeeRepository().save(this);
    }
    
    public double calculateTax(){
        return new TaxCalculator().calculateTax(this);
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