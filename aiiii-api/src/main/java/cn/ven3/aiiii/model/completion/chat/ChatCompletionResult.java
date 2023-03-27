package cn.ven3.aiiii.model.completion.chat;

import cn.ven3.aiiii.model.Usage;
import lombok.Data;

import java.util.List;

@Data
public class ChatCompletionResult {

    String id;

    String object;

    long created;

    String model;

    List<ChatCompletionChoice> choices;

    Usage usage;

}
