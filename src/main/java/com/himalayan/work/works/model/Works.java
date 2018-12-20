package com.himalayan.work.works.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;
import java.time.LocalDateTime;

/**
 * <p>
 * 工作经历记录
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_works")
public class Works extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 公司名称
     */
    private String company;

    /**
     * 公司所在地
     */
    private String address;

    /**
     * 公司规模
     */
    private String comscale;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 入职日期
     */
    private LocalDateTime hiredate;

    /**
     * 离职日期
     */
    private LocalDateTime leavedate;

    /**
     * 所属职位
     */
    private String job;

    /**
     * 平均薪资(月薪)
     */
    private Integer sal;

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
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getComscale() {
        return comscale;
    }

    public void setComscale(String comscale) {
        this.comscale = comscale;
    }
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
    public LocalDateTime getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDateTime hiredate) {
        this.hiredate = hiredate;
    }
    public LocalDateTime getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(LocalDateTime leavedate) {
        this.leavedate = leavedate;
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Works{" +
        "userid=" + userid +
        ", company=" + company +
        ", address=" + address +
        ", comscale=" + comscale +
        ", industry=" + industry +
        ", hiredate=" + hiredate +
        ", leavedate=" + leavedate +
        ", job=" + job +
        ", sal=" + sal +
        ", status=" + status +
        "}";
    }
}
