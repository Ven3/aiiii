package cn.ven3.aiiii.model;

import cn.hutool.http.Method;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.HashMap;

@Data
@Builder()
@AllArgsConstructor
public class RequestParam {

    /**
     * request method
     */
    @Builder.Default
    private Method methodType =Method.GET;
    /**
     * apiUrl eg. https://api.openai.com{apiUrl}
     */
    private String apiUrl;
    /**
     * request header
     */
    private HashMap<String, String> header;
    /**
     * request form
     */
    private HashMap<String, Object> params;

    /**
     * request body
     */
    private Object body;

    /**
     * request timeout
     */
    private int timeOut;

}
