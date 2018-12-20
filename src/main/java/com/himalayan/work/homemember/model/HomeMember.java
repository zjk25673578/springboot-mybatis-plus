package com.himalayan.work.homemember.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;
import java.time.LocalDateTime;

/**
 * <p>
 * 家庭成员信息表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_home_member")
public class HomeMember extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    private String mname;

    /**
     * 生日
     */
    private LocalDateTime mbirthday;

    /**
     * 年龄
     */
    private BigDecimal mage;

    /**
     * 备用字段1
     */
    private String backup1;

    /**
     * 备用字段2
     */
    private String backup2;

    /**
     * 备用字段3
     */
    private String backup3;

    /**
     * 备用字段4
     */
    private String backup4;

    /**
     * 备用字段5
     */
    private String backup5;

    /**
     * 有效标志
     */
    private Integer status;

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
    public LocalDateTime getMbirthday() {
        return mbirthday;
    }

    public void setMbirthday(LocalDateTime mbirthday) {
        this.mbirthday = mbirthday;
    }
    public BigDecimal getMage() {
        return mage;
    }

    public void setMage(BigDecimal mage) {
        this.mage = mage;
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
    public String getBackup3() {
        return backup3;
    }

    public void setBackup3(String backup3) {
        this.backup3 = backup3;
    }
    public String getBackup4() {
        return backup4;
    }

    public void setBackup4(String backup4) {
        this.backup4 = backup4;
    }
    public String getBackup5() {
        return backup5;
    }

    public void setBackup5(String backup5) {
        this.backup5 = backup5;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HomeMember{" +
        "mname=" + mname +
        ", mbirthday=" + mbirthday +
        ", mage=" + mage +
        ", backup1=" + backup1 +
        ", backup2=" + backup2 +
        ", backup3=" + backup3 +
        ", backup4=" + backup4 +
        ", backup5=" + backup5 +
        ", status=" + status +
        "}";
    }
}
