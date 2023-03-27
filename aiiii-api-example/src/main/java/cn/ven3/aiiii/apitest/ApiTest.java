package cn.ven3.aiiii.apitest;

import cn.ven3.aiiii.api.OpenAiApi;
import cn.ven3.aiiii.model.completion.CompletionRequest;
import cn.ven3.aiiii.model.completion.CompletionResult;
import cn.ven3.aiiii.model.completion.chat.ChatCompletionRequest;
import cn.ven3.aiiii.model.completion.chat.ChatCompletionResult;
import cn.ven3.aiiii.model.completion.chat.ChatMessage;
import cn.ven3.aiiii.model.completion.chat.ChatMessageRole;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ApiTest {


    @Before
    public void setApiKey(){
        System.setProperty("java.net.useSystemProxies", "true");

        System.setProperty("OPENAI_API_KEY", "");
    }

    @Test
    public void testCompletion(){
        CompletionRequest request = CompletionRequest.builder()
                .prompt("你好")
                .build();
        CompletionResult completion = OpenAiApi.completion(request);
        System.out.println(completion);
    }

    @Test
    public void testChat(){
        ChatCompletionRequest request = ChatCompletionRequest.builder()
                .messages(new ArrayList<ChatMessage>(){{
                    add(new ChatMessage(ChatMessageRole.USER.value(), "你好"));
                }})
                .build();
        ChatCompletionResult result = OpenAiApi.chatCompletion(request);
        System.out.println(result);
    }

}
