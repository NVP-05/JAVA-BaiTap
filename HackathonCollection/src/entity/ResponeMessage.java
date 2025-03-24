package entity;

public class ResponeMessage{
    private String message;
    private String error;

    public ResponeMessage(String message, String error){
        this.message = message;
        this.error = error;
    }

    public String getMessage(){
        return message;
    }

    public String getError(){
        return error;
    }
}
