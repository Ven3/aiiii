package cn.ven3.aiiii.model.response;

public class OpenAiHttpException extends RuntimeException {

    public final int statusCode;

    public final String code;


    public final String param;

    public final String type;

    public OpenAiHttpException(OpenAiError error, Exception parent, int statusCode) {
        super(error.error.message, parent);
        this.statusCode = statusCode;
        this.code = error.error.code;
        this.param = error.error.param;
        this.type = error.error.type;
    }
}
