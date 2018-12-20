package com.himalayan.work.usersinfo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_users_info")
public class UsersInfo extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 心情
     */
    private String feeling;

    /**
     * 血型
     */
    private Integer blood;

    /**
     * 属相
     */
    private Integer ansign;

    /**
     * 星座
     */
    private Integer conste;

    /**
     * 爱好
     */
    private String favor;

    /**
     * 个性签名
     */
    private String persign;

    /**
     * 最高学历
     */
    private Integer highedu;

    /**
     * 生日
     */
    private LocalDateTime birthday;

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
    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }
    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        this.blood = blood;
    }
    public Integer getAnsign() {
        return ansign;
    }

    public void setAnsign(Integer ansign) {
        this.ansign = ansign;
    }
    public Integer getConste() {
        return conste;
    }

    public void setConste(Integer conste) {
        this.conste = conste;
    }
    public String getFavor() {
        return favor;
    }

    public void setFavor(String favor) {
        this.favor = favor;
    }
    public String getPersign() {
        return persign;
    }

    public void setPersign(String persign) {
        this.persign = persign;
    }
    public Integer getHighedu() {
        return highedu;
    }

    public void setHighedu(Integer highedu) {
        this.highedu = highedu;
    }
    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UsersInfo{" +
        "userid=" + userid +
        ", feeling=" + feeling +
        ", blood=" + blood +
        ", ansign=" + ansign +
        ", conste=" + conste +
        ", favor=" + favor +
        ", persign=" + persign +
        ", highedu=" + highedu +
        ", birthday=" + birthday +
        ", status=" + status +
        "}";
    }
}
