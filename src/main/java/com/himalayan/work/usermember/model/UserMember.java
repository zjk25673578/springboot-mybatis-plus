package com.himalayan.work.usermember.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;

/**
 * <p>
 * 用户成员表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_user_member")
public class UserMember extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 系统用户表主键
     */
    private Integer userid;

    /**
     * 家庭成员表主键
     */
    private Integer memberid;

    /**
     * 成员关系
     */
    private Integer relation;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }
    public Integer getRelation() {
        return relation;
    }

    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "UserMember{" +
        "userid=" + userid +
        ", memberid=" + memberid +
        ", relation=" + relation +
        "}";
    }
}
