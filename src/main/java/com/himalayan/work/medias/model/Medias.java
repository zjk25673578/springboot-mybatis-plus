package com.himalayan.work.medias.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.himalayan.util.ModelParent;

/**
 * <p>
 * 用户文件表
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@TableName("mh_medias")
public class Medias extends ModelParent {

    private static final long serialVersionUID = 1L;

    /**
     * 文件名称
     */
    private String fname;

    /**
     * 文件原名称
     */
    private String filename;

    /**
     * 文件路径
     */
    private String filepath;

    /**
     * 文件类型
     */
    private Integer filetype;

    /**
     * 公开级别
     */
    private Integer comlevl;

    /**
     * 所属相册
     */
    private Integer photos;

    /**
     * 文件大小
     */
    private String filesize;

    /**
     * 描述
     */
    private String descp;

    /**
     * 有效标志
     */
    private Integer status;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
    public Integer getFiletype() {
        return filetype;
    }

    public void setFiletype(Integer filetype) {
        this.filetype = filetype;
    }
    public Integer getComlevl() {
        return comlevl;
    }

    public void setComlevl(Integer comlevl) {
        this.comlevl = comlevl;
    }
    public Integer getPhotos() {
        return photos;
    }

    public void setPhotos(Integer photos) {
        this.photos = photos;
    }
    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }
    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Medias{" +
        "fname=" + fname +
        ", filename=" + filename +
        ", filepath=" + filepath +
        ", filetype=" + filetype +
        ", comlevl=" + comlevl +
        ", photos=" + photos +
        ", filesize=" + filesize +
        ", descp=" + descp +
        ", status=" + status +
        "}";
    }
}
