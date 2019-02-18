public interface Chain {

    public void setNextChain(Chain nextInChain);

    public void routeInquiry(Inquiry inquiry );
}
