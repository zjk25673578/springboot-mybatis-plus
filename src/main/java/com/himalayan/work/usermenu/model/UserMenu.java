package com.himalayan.work.usermenu.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;

/**
 * <p>
 * 用户菜单表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_user_menu")
public class UserMenu extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 菜单id
     */
    private Integer menuid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    @Override
    public String toString() {
        return "UserMenu{" +
        "userid=" + userid +
        ", menuid=" + menuid +
        "}";
    }
}
