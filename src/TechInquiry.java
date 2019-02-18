public class TechInquiry implements  Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void routeInquiry(Inquiry inquiry) {

        if (inquiry.getRequest() == "tech") {

            System.out.println("The message was forwarded to tech");

            // add observer
            InquiryGrabber inquiryGrabber = new InquiryGrabber();
            InquiryObserver techObserver = new InquiryObserver(inquiryGrabber);
            inquiryGrabber.setInquiry(inquiry);

        } else {
            nextInChain.routeInquiry(inquiry);        }

    }

}



