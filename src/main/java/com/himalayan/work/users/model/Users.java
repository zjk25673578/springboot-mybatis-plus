package com.himalayan.work.users.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;

/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@ToString(callSuper = true)
@TableName("mh_users")
public class Users extends ModelParent {

    public Users() {
    }

    public Users(Integer ids) {
        super.setIds(ids);
    }

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String uname;

    /**
     * 密码
     */
    private String pword;

    /**
     * 姓名
     */
    private String rname;

    /**
     * 头像
     */
    private String pic;

    /**
     * 用户类型: 1,超级管理员; 0:普通用户
     */
    @TableField("userType")
    private Integer userType;

    /**
     * 家庭id
     */
    private Integer homeid;

    /**
     * 启用,禁用状态
     */
    private Integer setups;

    /**
     * 有效标志
     */
    private Integer status;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getHomeid() {
        return homeid;
    }

    public void setHomeid(Integer homeid) {
        this.homeid = homeid;
    }

    public Integer getSetups() {
        return setups;
    }

    public void setSetups(Integer setups) {
        this.setups = setups;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
