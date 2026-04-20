public class GourmetCoffee {
    private Sales sales;

    private SalesFormatter salesFormatter;

    static void main(String[] args) {

    }

    private GourmetCoffee(){
        sales = new Sales();
        salesFormatter = new SalesFormatter() {
            @Override
            public String formatSales(Sales sales) {
                return "";
            }
        };
    }

    private Catalog loadCatalog(){
        return null;
    }

    private  void loadSales(Catalog catalog){

    }

    private int getChoice(){

    }

    private void setSalesFormatter(SalesFormatter newFormatter){
        this.salesFormatter = newFormatter;
    }

    private void displaySales(){
        this.salesFormatter.formatSales( sales);
    }

    private void run(){

    }
}
