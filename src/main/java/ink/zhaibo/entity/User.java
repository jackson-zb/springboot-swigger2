package ink.zhaibo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description= "响应数据")
public class User {
    @ApiModelProperty(value = "用户id")
    private Integer uid;
    @ApiModelProperty(value = "用户昵称",required = true)
    private String nickname;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public User(Integer uid, String nickname) {
        this.uid = uid;
        this.nickname = nickname;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
