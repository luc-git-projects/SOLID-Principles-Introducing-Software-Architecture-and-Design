package interfacesegregationprinciple.rightway;

public class HPPrinterScanner implements IPrint, IScan{
    
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
}