package cn.ven3.aiiii.model.completion;


import cn.ven3.aiiii.model.Usage;
import lombok.Data;

import java.util.List;

@Data
public class CompletionResult {

    String id;

    String object;

    long created;

    String model;

    List<CompletionChoice> choices;

    Usage usage;
}
