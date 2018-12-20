package com.himalayan.work.finance.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;
import java.time.LocalDateTime;

/**
 * <p>
 * 财务信息记录表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_finance")
public class Finance extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 进出账
     */
    private Integer ftype;

    /**
     * 金额
     */
    private BigDecimal cash;

    /**
     * 产生类型
     */
    private Integer createtype;

    /**
     * 产生日期
     */
    private LocalDateTime prodate;

    /**
     * 产生事由
     */
    private String reason;

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
    public Integer getFtype() {
        return ftype;
    }

    public void setFtype(Integer ftype) {
        this.ftype = ftype;
    }
    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }
    public Integer getCreatetype() {
        return createtype;
    }

    public void setCreatetype(Integer createtype) {
        this.createtype = createtype;
    }
    public LocalDateTime getProdate() {
        return prodate;
    }

    public void setProdate(LocalDateTime prodate) {
        this.prodate = prodate;
    }
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Finance{" +
        "userid=" + userid +
        ", ftype=" + ftype +
        ", cash=" + cash +
        ", createtype=" + createtype +
        ", prodate=" + prodate +
        ", reason=" + reason +
        ", status=" + status +
        "}";
    }
}
