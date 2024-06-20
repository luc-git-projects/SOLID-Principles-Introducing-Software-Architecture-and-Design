package interfacesegregationprinciple.wrongway;

public class XeroxWorkCenter implements IMultifunction{

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
        /*
            Real fax code code here
        */
    }

    @Override
    public void internetFax() {
        /*
            Real internet fax code here
        */
    }

}