
package br.com.bh.utils;


public class CreateDaoException extends RuntimeException{

    public CreateDaoException() {
    }

    public CreateDaoException(String message) {
        super(message);
    }

    public CreateDaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateDaoException(Throwable cause) {
        super(cause);
    }

    public CreateDaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
