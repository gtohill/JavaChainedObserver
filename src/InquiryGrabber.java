import java.util.ArrayList;

public class InquiryGrabber implements Subject {

    private ArrayList<Observer> observers;
    private Inquiry inquiry;

    public InquiryGrabber() {

        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {

        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {

        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex + 1));
        observers.remove(observerIndex);


    }

    @Override
    public void notifyObserver() {

        for (Observer observer : observers) {
            observer.update(inquiry);
        }

    }

    public void setInquiry(Inquiry newInquiry) {

        this.inquiry = newInquiry;
        notifyObserver();
    }
}

