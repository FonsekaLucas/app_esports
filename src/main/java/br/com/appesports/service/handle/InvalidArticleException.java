package br.com.appesports.service.handle;

// Exception for any invalid argument from any article
public class InvalidArticleException extends RuntimeException {

    public InvalidArticleException() {
    }

    public InvalidArticleException(String message) {
        super(message);
    }

}
