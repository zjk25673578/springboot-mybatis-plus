package com.himalayan.work.notebook.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;

/**
 * <p>
 * 留言信息表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_notebook")
public class Notebook extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 内容
     */
    private String conte;

    /**
     * 提醒谁看
     */
    private Integer touser;

    /**
     * 有效标志
     */
    private Integer status;

    public String getConte() {
        return conte;
    }

    public void setConte(String conte) {
        this.conte = conte;
    }
    public Integer getTouser() {
        return touser;
    }

    public void setTouser(Integer touser) {
        this.touser = touser;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Notebook{" +
        "conte=" + conte +
        ", touser=" + touser +
        ", status=" + status +
        "}";
    }
}
