package com.himalayan.work.homes.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;

/**
 * <p>
 * 家庭信息表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_homes")
public class Homes extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String hcode;

    /**
     * 名称
     */
    private String hname;

    /**
     * 有效标志
     */
    private Integer status;

    public String getHcode() {
        return hcode;
    }

    public void setHcode(String hcode) {
        this.hcode = hcode;
    }
    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Homes{" +
        "hcode=" + hcode +
        ", hname=" + hname +
        ", status=" + status +
        "}";
    }
}
