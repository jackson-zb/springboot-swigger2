package ink.zhaibo.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UserRequest implements Serializable{
    private static final long serialVersionUID = -9069516241035890190L;
    @ApiModelProperty(value = "用户id")
    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
