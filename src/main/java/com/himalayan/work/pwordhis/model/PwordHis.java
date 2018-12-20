package com.himalayan.work.pwordhis.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;
import java.time.LocalDateTime;

/**
 * <p>
 * 历史密码信息
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_pword_his")
public class PwordHis extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 账号id
     */
    private Integer accid;

    /**
     * 密码
     */
    private String pword;

    /**
     * 密码修改日期
     */
    private LocalDateTime changetime;

    public Integer getAccid() {
        return accid;
    }

    public void setAccid(Integer accid) {
        this.accid = accid;
    }
    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }
    public LocalDateTime getChangetime() {
        return changetime;
    }

    public void setChangetime(LocalDateTime changetime) {
        this.changetime = changetime;
    }

    @Override
    public String toString() {
        return "PwordHis{" +
        "accid=" + accid +
        ", pword=" + pword +
        ", changetime=" + changetime +
        "}";
    }
}
