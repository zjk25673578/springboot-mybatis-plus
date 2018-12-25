package com.himalayan.work.emp.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author zjk
 * @since 2018-12-25
 */
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "empno", type = IdType.AUTO)
    private Integer empno;

    private String ename;

    private Integer sex;

    private Integer age;

    private LocalDate hiredate;

    private Double sal;

    private Integer comm;

    private Integer dno;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public LocalDate getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }
    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }
    public Integer getComm() {
        return comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }
    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    @Override
    public String toString() {
        return "Emp{" +
        "empno=" + empno +
        ", ename=" + ename +
        ", sex=" + sex +
        ", age=" + age +
        ", hiredate=" + hiredate +
        ", sal=" + sal +
        ", comm=" + comm +
        ", dno=" + dno +
        "}";
    }
}
