public class InquiryObserver implements Observer {

    private Inquiry inquiry;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public InquiryObserver(Subject stockGrabber){

        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        // Add the observer to the Subjects ArrayList
        stockGrabber.register(this);
    }

    @Override
    public void update(Inquiry newInquiry) {

        this.inquiry = newInquiry;
        printThePrices();
    }

    public void printThePrices(){

        System.out.println("Inquiry: "+inquiry.getName()+" "+inquiry.getEmail()+" "+inquiry.getRequest()+" "+inquiry.getText());

    }
}
