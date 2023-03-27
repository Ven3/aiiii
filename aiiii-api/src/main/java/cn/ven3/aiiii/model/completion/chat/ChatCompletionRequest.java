package cn.ven3.aiiii.model.completion.chat;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatCompletionRequest {

    @Builder.Default
    String model = "gpt-3.5-turbo";

    List<ChatMessage> messages;

    @Builder.Default
    Double temperature = Double.valueOf(0.8);

    @JSONField(name = "top_p")
    @Builder.Default
    Double topP = Double.valueOf(1);

    Integer n;

    Boolean stream;

    List<String> stop;

    @JSONField(name = "max_tokens")
    @Builder.Default
    Integer maxTokens = 255;

    @JSONField(name = "presence_penalty")
    @Builder.Default
    Double presencePenalty = Double.valueOf(1);

    @JSONField(name = "frequency_penalty")
    @Builder.Default
    Double frequencyPenalty = Double.valueOf(1);

    @JSONField(name = "logit_bias")
    Map<String, Integer> logitBias;

    String user;
}
