package bookmyshow.Book_My_Show_Backend.exception;

public class DuplicateEntityException extends RuntimeException{
    private final String message;
    public DuplicateEntityException(String message){
        super(message);
        this.message=message;
    }
}
