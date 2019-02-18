public class CustomerInquiry implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void routeInquiry(Inquiry inquiry) {

        if (inquiry.getRequest() == "cs") {

            System.out.println("The message was forwarded to Customer Service");

            // add observer
            InquiryGrabber inquiryGrabber = new InquiryGrabber();
            InquiryObserver customerServiceObserver = new InquiryObserver(inquiryGrabber);
            inquiryGrabber.setInquiry(inquiry);

        } else {
            System.out.println("The message was forwarded to Customer Service");
        }
    }

}
