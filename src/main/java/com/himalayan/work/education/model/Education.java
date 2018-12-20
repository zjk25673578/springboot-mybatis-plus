package com.himalayan.work.education.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;
import java.time.LocalDateTime;

/**
 * <p>
 * 教育经历信息
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_education")
public class Education extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 就读学校
     */
    private String school;

    /**
     * 所学专业
     */
    private String major;

    /**
     * 就读班级
     */
    private String clazz;

    /**
     * 担任职务
     */
    private String place;

    /**
     * 入学日期
     */
    private LocalDateTime startime;

    /**
     * 毕业日期
     */
    private LocalDateTime endtime;

    /**
     * 毕业照
     */
    private String photo;

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
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    public LocalDateTime getStartime() {
        return startime;
    }

    public void setStartime(LocalDateTime startime) {
        this.startime = startime;
    }
    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Education{" +
        "userid=" + userid +
        ", school=" + school +
        ", major=" + major +
        ", clazz=" + clazz +
        ", place=" + place +
        ", startime=" + startime +
        ", endtime=" + endtime +
        ", photo=" + photo +
        ", status=" + status +
        "}";
    }
}
