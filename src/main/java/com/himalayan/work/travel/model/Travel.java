package com.himalayan.work.travel.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;

/**
 * <p>
 * 家庭旅行计划表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_travel")
public class Travel extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 家庭id
     */
    private Integer homeid;

    /**
     * 计划人
     */
    private Integer userid;

    /**
     * 目的地
     */
    private String targets;

    /**
     * 目标地详情
     */
    private String detail;

    /**
     * 计划时长(单位:天)
     */
    private Integer lastime;

    /**
     * 计划消费
     */
    private Integer consume;

    /**
     * 是否实现
     */
    private Integer isimpl;

    /**
     * 有效标志
     */
    private Integer status;

    public Integer getHomeid() {
        return homeid;
    }

    public void setHomeid(Integer homeid) {
        this.homeid = homeid;
    }
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getTargets() {
        return targets;
    }

    public void setTargets(String targets) {
        this.targets = targets;
    }
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    public Integer getLastime() {
        return lastime;
    }

    public void setLastime(Integer lastime) {
        this.lastime = lastime;
    }
    public Integer getConsume() {
        return consume;
    }

    public void setConsume(Integer consume) {
        this.consume = consume;
    }
    public Integer getIsimpl() {
        return isimpl;
    }

    public void setIsimpl(Integer isimpl) {
        this.isimpl = isimpl;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Travel{" +
        "homeid=" + homeid +
        ", userid=" + userid +
        ", targets=" + targets +
        ", detail=" + detail +
        ", lastime=" + lastime +
        ", consume=" + consume +
        ", isimpl=" + isimpl +
        ", status=" + status +
        "}";
    }
}
