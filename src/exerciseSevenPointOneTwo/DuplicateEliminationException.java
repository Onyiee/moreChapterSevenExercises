package exerciseSevenPointOneTwo;

public class DuplicateEliminationException extends Exception{
    public DuplicateEliminationException() {
    }

    public DuplicateEliminationException(String message) {
        super(message);
    }

    public DuplicateEliminationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateEliminationException(Throwable cause) {
        super(cause);
    }

    public DuplicateEliminationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
