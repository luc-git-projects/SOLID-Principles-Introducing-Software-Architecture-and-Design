package interfacesegregationprinciple.wrongway;

public class HPPrinterScanner implements IMultifunction{

    @Override
    public void print() {
       /*
            Real Printing code here
        */
    }

    @Override
    public void getPrintSpoolDetails() {
        /*
            Real print spool details code here
        */
    }

    @Override
    public void scan() {
        /*
            Real scan code here
        */
    }

    @Override
    public void scanPhoto() {
        /*
            Real  photo scan code here
        */
    }

    @Override
    public void fax() {
    
    }

    @Override
    public void internetFax() {
  
        
    }
}