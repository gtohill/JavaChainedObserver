public class SubmitInquiry {

    public static void main(String[] args){

        Chain chainInquiry1 = new SalesInquiry();
        Chain chainInquiry2 = new TechInquiry();
        Chain chainInquiry3 = new BillingInquiry();
        Chain chainInquiry4 = new CustomerInquiry();

        chainInquiry1.setNextChain(chainInquiry2);
        chainInquiry2.setNextChain(chainInquiry3);
        chainInquiry3.setNextChain(chainInquiry4);

        Inquiry inquiry1 = new Inquiry("Gary", "gt@local.com", "sales", "I would like to buy your products" );
        Inquiry inquiry2 = new Inquiry("Rob", "rt@local.com", "billing", "I have a billing question." );
        Inquiry inquiry3 = new Inquiry("Jim", "jt@local.com", "cs", "I need customer service help." );
        Inquiry inquiry4 = new Inquiry("Jean", "jean@local.com", "tech", "My equipment is not working." );

        chainInquiry1.routeInquiry(inquiry1);
        chainInquiry2.routeInquiry(inquiry2);
        chainInquiry3.routeInquiry(inquiry3);
        chainInquiry4.routeInquiry(inquiry4);



    }

}
