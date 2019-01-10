package com.himalayan.app;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.himalayan.work.emp.dao.EmpMapper;
import com.himalayan.work.emp.model.Emp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTestsForMapper {

    @Autowired
    private EmpMapper empMapper;

    private Emp e;
    private Emp emp;
    private List<Emp> empList;

    @Before
    public void before() {
        e = new Emp();
        e.setEname("Mapper_测试员工");
        e.setSex(1);
        e.setAge(25);
        e.setHiredate(LocalDate.now());
        e.setSal(200.36);
        e.setComm(1200);
        e.setDno(null);


        empList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            emp = new Emp();
            emp.setEname("Mapper_测试员工" + i);
            emp.setSex(1);
            emp.setAge(25);
            emp.setHiredate(LocalDate.now());
            emp.setSal(200.36);
            emp.setComm(1200);
            emp.setDno(null);
            empList.add(emp);
        }
    }

    //************************************************** INSERT *****************************************************

    public void insert() {
        int r = empMapper.insert(e);
        // 添加进数据库之后可以拿到主键
        // INSERT INTO emp ( ename, sex, age, hiredate, sal, comm ) VALUES ( ?, ?, ?, ?, ?, ? )
        System.out.println(r);
        System.out.println(e.getEmpno());
    }

    //************************************************** DELETE *****************************************************

    public void deleteById() {
        int r = empMapper.deleteById(57);
        // DELETE FROM emp WHERE empno=?
        System.out.println(r);
    }

    public void deleteBatchIds() {
        List<Serializable> ids = new ArrayList<>();
        ids.add(24);
        ids.add(25);
        ids.add(26);
        int r = empMapper.deleteBatchIds(ids);
        // DELETE FROM emp WHERE empno IN ( ? , ? , ? )
        System.out.println(r);
    }

    public void deleteByMap() {
        Map<String, Object> args = new HashMap<>();
        args.put("age", 30);
        args.put("ename", "测试员工");
        int r = empMapper.deleteByMap(args);
        // DELETE FROM emp WHERE ename = ? AND age = ?
        System.out.println(r);
    }

    public void delete() {
        UpdateWrapper<Emp> wrapper = new UpdateWrapper<>();
        wrapper.like("ename", "测试员工").or().between("sal", 1000, 2000);
        int r = empMapper.delete(wrapper);
        // DELETE FROM emp WHERE ename LIKE ? OR sal BETWEEN ? AND ?
        System.out.println(r);
    }

    //************************************************** UPDATE *****************************************************

    public void update() {
        UpdateWrapper<Emp> wrapper = new UpdateWrapper<>();
        wrapper.eq("ename", "新名称");
        int r = empMapper.update(e, wrapper);
        // UPDATE emp SET ename=?, sex=?, age=?, hiredate=?, sal=?, comm=? WHERE ename = ?
        System.out.println(r);
    }

    public void updateById() {
        e.setEmpno(53);
        e.setEname("修改之后的ename");
        int r = empMapper.updateById(e);
        // UPDATE emp SET ename=?, sex=?, age=?, hiredate=?, sal=?, comm=? WHERE empno=?
        System.out.println(r);
    }

    //************************************************** SELECT *****************************************************

    public void selectCount() {
        UpdateWrapper<Emp> wrapper = new UpdateWrapper<>();
        wrapper.eq("ename", "Mapper_测试员工");
        int r = empMapper.selectCount(wrapper); // 统计数量
        // SELECT COUNT(1) FROM emp WHERE ename = ?
        System.out.println(r);
    }

    public void selectById() {
        Emp e = empMapper.selectById(54);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE empno=?
        System.out.println(e);
    }

    public void selectByMap() {
        Map<String, Object> args = new HashMap<>();
        args.put("age", 26);
        args.put("sal", 2000);
        List<Emp> emps = empMapper.selectByMap(args);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE ename = ? AND age = ? AND sal = ?
        System.out.println(emps);
    }

    public void selectOne() {
        QueryWrapper<Emp> wrapper = new QueryWrapper<>();
        wrapper.likeRight("ename", "J");
        // 查询结果只能是一个, 如果有多个结果会报错
        // org.apache.ibatis.exceptions.TooManyResultsException:
        //      Expected one result (or null) to be returned by selectOne(), but found: 2
        Emp emp = empMapper.selectOne(wrapper);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE ename LIKE ?
        System.out.println(emp);
    }

    public void selectBatchIds() {
        Set<Integer> set = new HashSet<>();
        set.add(96);
        set.add(97);
        List<Emp> emps = empMapper.selectBatchIds(set);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE empno IN ( ? , ? )
        System.out.println(emps);
    }

    public void selectList() {
        QueryWrapper<Emp> wrapper = new QueryWrapper<>();
        wrapper.likeRight("ename", "L");
        List<Emp> emps = empMapper.selectList(wrapper);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE ename LIKE ?
        System.out.println(emps);
    }

    @Test
    public void selectPage() {
        // 查询数据列表
        // private List<T> records = Collections.emptyList();

        // 总数
        // private long total = 0;

        // 每页显示条数，默认 10
        // private long size = 10;

        // 当前页
        // private long current = 1;

        // SQL 排序 ASC 数组
        // private String[] ascs;

        // SQL 排序 DESC 数组
        // private String[] descs;

        // 自动优化 COUNT SQL
        // private boolean optimizeCountSql = true;

        // 是否进行 count 查询
        // private boolean isSearchCount = true;

//        QueryWrapper<Emp> wrapper = new QueryWrapper<>();
//        wrapper.ge("sal", 1000);
//        IPage<Emp> iPage = new Page<>();
//        iPage.setSize(5);
//        iPage.setCurrent(2);
//        empMapper.selectPage(iPage, wrapper);
//        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE sal >= ? LIMIT ?,?
//        System.out.println(iPage.getRecords());

        // 不使用mybatis-plus提供的page插件

        QueryWrapper<Emp> wrapper = new QueryWrapper<>();
        wrapper.ge("sal", 1000);
        wrapper.last("limit 5, 5");
        List<Emp> emps = empMapper.selectList(wrapper);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE sal >= ? limit 5, 5
        p(emps);
    }

    public static void p(List<?> list) {
        if (list != null && list.size() > 0) {
            for (Object o : list) {
                System.out.println(o);
            }
        }
    }

    public static void p(Object o) {
        System.out.println(o);
    }
}

