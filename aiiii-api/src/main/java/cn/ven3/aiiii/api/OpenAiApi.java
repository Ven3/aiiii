package cn.ven3.aiiii.api;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.URLUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.http.Method;
import cn.ven3.aiiii.model.Model;
import cn.ven3.aiiii.model.RequestParam;
import cn.ven3.aiiii.model.completion.CompletionRequest;
import cn.ven3.aiiii.model.completion.CompletionResult;
import cn.ven3.aiiii.model.completion.chat.ChatCompletionResult;
import cn.ven3.aiiii.model.completion.chat.ChatCompletionRequest;
import cn.ven3.aiiii.model.response.OpenAiResponse;
import com.alibaba.fastjson.JSON;

public class OpenAiApi {

    private static final String BASE_URL = "https://api.openai.com";


    public static CompletionResult completion(CompletionRequest request) {
        RequestParam reqParam = RequestParam.builder()
                .apiUrl("/v1/completions")
                .methodType(Method.POST)
                .body(request)
                .build();
        return JSON.parseObject(execute(reqParam), CompletionResult.class);
    }

    public static ChatCompletionResult chatCompletion(ChatCompletionRequest request) {

        RequestParam reqParam = RequestParam.builder()
                .apiUrl("/v1/chat/completions")
                .methodType(Method.POST)
                .body(request)
                .build();

        ChatCompletionResult chatCompletionResult = JSON.parseObject(execute(reqParam), ChatCompletionResult.class);
        return chatCompletionResult;
    }


    private static String execute(RequestParam requestParam) {
        HttpRequest request = HttpUtil.createRequest(requestParam.getMethodType(), URLUtil.completeUrl(BASE_URL, requestParam.getApiUrl()));

        request.setConnectionTimeout(ObjectUtil.defaultIfNull(requestParam.getTimeOut(), 15000));
        request.header("Authorization", "Bearer " + System.getProperty("OPENAI_API_KEY"));
        request.addHeaders(requestParam.getHeader());
        request.form(requestParam.getParams());
        request.body(JSON.toJSONString(requestParam.getBody()));
        return request.execute().body();
    }
}
