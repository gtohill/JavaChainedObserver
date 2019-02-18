public class Inquiry {


    private String name;
    private String email;
    private String request;
    private String text;


    // constructor
    public Inquiry(String name, String email, String request, String text){

        this.name = name;
        this.email = email;
        this.request = request;
        this.text = text;

    }

    // getters and setters
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getRequest(){
        return request;
    }

    public String getText() {
        return text;
    }

}
