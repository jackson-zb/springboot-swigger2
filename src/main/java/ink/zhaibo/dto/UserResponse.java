package ink.zhaibo.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UserResponse implements Serializable {
    private static final long serialVersionUID = -80811592907692327L;
    @ApiModelProperty(value = "用户昵称", required = true)
    private String nickname;

    @ApiModelProperty(value = "用户性别 male：男 female：女", required = true)
    private String sex;

    @ApiModelProperty(value = "用户余额", required = true)
    private String balance;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
