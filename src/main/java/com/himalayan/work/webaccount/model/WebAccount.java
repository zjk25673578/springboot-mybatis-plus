package com.himalayan.work.webaccount.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;

/**
 * <p>
 * 网站账号信息表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_web_account")
public class WebAccount extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 网站id
     */
    private Integer webid;

    /**
     * 账号
     */
    private String accounts;

    /**
     * 密码
     */
    private String pword;

    /**
     * 邮箱
     */
    private String emails;

    /**
     * 手机
     */
    private String mphone;

    /**
     * 备注
     */
    private String note;

    /**
     * 密码历史id
     */
    private Integer pwordhis;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 有效标志
     */
    private Integer status;

    public Integer getWebid() {
        return webid;
    }

    public void setWebid(Integer webid) {
        this.webid = webid;
    }
    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }
    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }
    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }
    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public Integer getPwordhis() {
        return pwordhis;
    }

    public void setPwordhis(Integer pwordhis) {
        this.pwordhis = pwordhis;
    }
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WebAccount{" +
        "webid=" + webid +
        ", accounts=" + accounts +
        ", pword=" + pword +
        ", emails=" + emails +
        ", mphone=" + mphone +
        ", note=" + note +
        ", pwordhis=" + pwordhis +
        ", userid=" + userid +
        ", status=" + status +
        "}";
    }
}
