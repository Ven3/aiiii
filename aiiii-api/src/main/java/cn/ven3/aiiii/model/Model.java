package cn.ven3.aiiii.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class Model {

    public String id;

    public String object;

    @JSONField(name = "owned_by")
    public String ownedBy;

    public List<Permission> permission;

    public String root;

    public String parent;
}
