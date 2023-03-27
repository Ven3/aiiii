package cn.ven3.aiiii.model.completion.chat;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ChatCompletionChoice {

    Integer index;

    ChatMessage message;

    @JSONField(name = "finish_reason")
    String finishReason;
}
