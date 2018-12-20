package com.himalayan.work.dict.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;

/**
 * <p>
 * 数据字典表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_dict")
public class Dict extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 标识
     */
    private Integer diccode;

    /**
     * 值
     */
    private String dicvalue;

    /**
     * 有效标志
     */
    private Integer status;

    public Integer getDiccode() {
        return diccode;
    }

    public void setDiccode(Integer diccode) {
        this.diccode = diccode;
    }
    public String getDicvalue() {
        return dicvalue;
    }

    public void setDicvalue(String dicvalue) {
        this.dicvalue = dicvalue;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Dict{" +
        "diccode=" + diccode +
        ", dicvalue=" + dicvalue +
        ", status=" + status +
        "}";
    }
}
