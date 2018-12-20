package com.himalayan.work.menu.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;

/**
 * <p>
 * 系统菜单表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_menu")
public class Menu extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 父级id
     */
    private Integer parentid;

    /**
     * 菜单名称
     */
    private String menuname;

    /**
     * 访问路径
     */
    private String murl;

    /**
     * 图标
     */
    private String icon;

    /**
     * 有效标志
     */
    private Integer status;

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }
    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Menu{" +
        "parentid=" + parentid +
        ", menuname=" + menuname +
        ", murl=" + murl +
        ", icon=" + icon +
        ", status=" + status +
        "}";
    }
}
