package com.himalayan.work.webinfo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;

/**
 * <p>
 * 网站信息表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_webinfo")
public class Webinfo extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 网站名称
     */
    private String webname;

    /**
     * 网址
     */
    private String webadd;

    /**
     * 备注
     */
    private String note;

    /**
     * 有效标志
     */
    private Integer status;

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname;
    }
    public String getWebadd() {
        return webadd;
    }

    public void setWebadd(String webadd) {
        this.webadd = webadd;
    }
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Webinfo{" +
        "webname=" + webname +
        ", webadd=" + webadd +
        ", note=" + note +
        ", status=" + status +
        "}";
    }
}
