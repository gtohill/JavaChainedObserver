public class BillingInquiry implements Chain {


    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void routeInquiry(Inquiry inquiry) {
        if (inquiry.getRequest() == "billing") {

            System.out.println("The message was forwarded to billing");

            // add observer
            InquiryGrabber inquiryGrabber = new InquiryGrabber();
            InquiryObserver billingObserver = new InquiryObserver(inquiryGrabber);
            inquiryGrabber.setInquiry(inquiry);

        } else {
            nextInChain.routeInquiry(inquiry);
        }
    }

}



