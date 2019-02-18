public class SalesInquiry implements Chain{


    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void routeInquiry(Inquiry inquiry) {
        if (inquiry.getRequest() == "sales") {

            System.out.println("The message was forwarded to sales");
            // add observer
            InquiryGrabber inquiryGrabber = new InquiryGrabber();
            InquiryObserver salesObserver = new InquiryObserver(inquiryGrabber);
            inquiryGrabber.setInquiry(inquiry);

        } else {
            nextInChain.routeInquiry(inquiry);        }

    }

}
