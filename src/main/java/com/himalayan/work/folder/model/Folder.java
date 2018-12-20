package com.himalayan.work.folder.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;

/**
 * <p>
 * 文件夹信息
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_folder")
public class Folder extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 父级id
     */
    private Integer parentid;

    /**
     * 所属用户
     */
    private Integer userid;

    /**
     * 文件夹名称
     */
    private String foldername;

    /**
     * 删除标志
     */
    private Integer status;

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getFoldername() {
        return foldername;
    }

    public void setFoldername(String foldername) {
        this.foldername = foldername;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Folder{" +
        "parentid=" + parentid +
        ", userid=" + userid +
        ", foldername=" + foldername +
        ", status=" + status +
        "}";
    }
}
