package com.himalayan.work.dept.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zjk
 * @since 2018-12-25
 */
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ids", type = IdType.AUTO)
    private Integer ids;

    private Integer dno;

    private String dname;

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }
    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
        "ids=" + ids +
        ", dno=" + dno +
        ", dname=" + dname +
        "}";
    }
}
