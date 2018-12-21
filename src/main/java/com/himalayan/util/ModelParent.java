package com.himalayan.util;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

public class ModelParent {

    @TableId(type = IdType.AUTO)
    private Integer ids;

    /**
     * 创建日期
     */
    private Date createtime;

    /**
     * 创建人
     */
    private Integer creator;

    /**
     * 创建人名称
     */
    private String createname;

    /**
     * 修改日期
     */
    private Date updatetime;

    /**
     * 修改人
     */
    private Integer updator;

    /**
     * 修改人名称
     */
    private String updatename;

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getUpdator() {
        return updator;
    }

    public void setUpdator(Integer updator) {
        this.updator = updator;
    }

    public String getUpdatename() {
        return updatename;
    }

    public void setUpdatename(String updatename) {
        this.updatename = updatename;
    }

    @Override
    public String toString() {
        return "ModelParent{" +
                "ids=" + ids +
                ", createtime=" + createtime +
                ", creator=" + creator +
                ", createname='" + createname + '\'' +
                ", updatetime=" + updatetime +
                ", updator=" + updator +
                ", updatename='" + updatename + '\'' +
                '}';
    }
}
