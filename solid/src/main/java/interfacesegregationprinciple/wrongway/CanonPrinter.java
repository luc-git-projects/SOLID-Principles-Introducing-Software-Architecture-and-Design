package interfacesegregationprinciple.wrongway;

public class CanonPrinter implements IMultifunction{

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

    }

    @Override
    public void scanPhoto() {
    
    }

    @Override
    public void fax() {
     
    }

    @Override
    public void internetFax() {
      
    }
}