package Chapter14;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String inValid_email) {
        super(inValid_email);
    }
}
