package com.himalayan.work.datebook.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;
import java.time.LocalDateTime;

/**
 * <p>
 * 大事记表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_datebook")
public class Datebook extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 事件主题
     */
    private String title;

    /**
     * 事件详情
     */
    private String detail;

    /**
     * 发生日期
     */
    private LocalDateTime happend;

    /**
     * 重要等级
     */
    private Integer remarks;

    /**
     * 备用字段1
     */
    private String backup1;

    /**
     * 备用字段2
     */
    private String backup2;

    /**
     * 有效标志
     */
    private Integer status;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    public LocalDateTime getHappend() {
        return happend;
    }

    public void setHappend(LocalDateTime happend) {
        this.happend = happend;
    }
    public Integer getRemarks() {
        return remarks;
    }

    public void setRemarks(Integer remarks) {
        this.remarks = remarks;
    }
    public String getBackup1() {
        return backup1;
    }

    public void setBackup1(String backup1) {
        this.backup1 = backup1;
    }
    public String getBackup2() {
        return backup2;
    }

    public void setBackup2(String backup2) {
        this.backup2 = backup2;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Datebook{" +
        "userid=" + userid +
        ", title=" + title +
        ", detail=" + detail +
        ", happend=" + happend +
        ", remarks=" + remarks +
        ", backup1=" + backup1 +
        ", backup2=" + backup2 +
        ", status=" + status +
        "}";
    }
}
