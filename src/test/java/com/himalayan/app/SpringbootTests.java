package com.himalayan.app;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.himalayan.work.emp.model.Emp;
import com.himalayan.work.emp.service.EmpService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTests {

    @Autowired
    private EmpService empService;

    private Emp e;
    private Emp emp;
    private List<Emp> empList;

    @Before
    public void before() {
        e = new Emp();
        e.setEname("测试员工");
        e.setSex(1);
        e.setAge(25);
        e.setHiredate(LocalDate.now());
        e.setSal(200.36);
        e.setComm(1200);
        e.setDno(null);


        empList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            emp = new Emp();
            emp.setEname("测试员工" + i);
            emp.setSex(1);
            emp.setAge(25);
            emp.setHiredate(LocalDate.now());
            emp.setSal(200.36);
            emp.setComm(1200);
            emp.setDno(null);
            empList.add(emp);
        }
    }

    public void save() {
        boolean r = empService.save(e);
        // 添加进数据库之后可以拿到主键
        // INSERT INTO emp ( ename, sex, age, hiredate, sal, comm ) VALUES ( ?, ?, ?, ?, ?, ? )
        System.out.println(r);
        System.out.println(e.getEmpno());
    }

    //************************************************** SAVE_AND_UPDATE *****************************************************

    public void saveOrUpdate() {
        // boolean r = empService.saveOrUpdate(e);
        // INSERT INTO emp ( ename, sex, age, hiredate, sal, comm ) VALUES ( ?, ?, ?, ?, ?, ? )

        e.setEmpno(2);
        e.setEname("newName");
        boolean r = empService.saveOrUpdate(e);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE empno=?

        // UPDATE emp SET ename=?, sex=?, age=?, hiredate=?, sal=?, comm=? WHERE empno=?

        // 先判断实体类的主键, 如果主键不为空, 则进行一次查询, 查询结果仍然为空, 做添加操作
        // 但是返回的主键值依然以配置的主键生成策略优先

        System.out.println(r);
        System.out.println(e.getEmpno());
    }

    public void saveBatch() {
        // 循环调用
        // INSERT INTO emp ( ename, sex, age, hiredate, sal, comm ) VALUES ( ?, ?, ?, ?, ?, ? )
        boolean r = empService.saveBatch(empList);
        for (Emp emp : empList) {
            System.out.println(emp.getEmpno());
        }
        p(r);
    }

    public void saveBatch2() {
        // 循环调用
        // INSERT INTO emp ( ename, sex, age, hiredate, sal, comm ) VALUES ( ?, ?, ?, ?, ?, ? )
        // 每到i处, 先执行一下预编译的语句, i的值默认是1000
        boolean r = empService.saveBatch(empList, 1);
        p(r);
    }

    public void saveOrUpdateBatch() {
        for (int i = 0; i < empList.size(); i++) {
            Emp emp = empList.get(i);
            if (i % 2 == 0) {
                emp.setEmpno(5055 + i);
                emp.setEname("saveOrUpdateBatch" + i);
            }
        }
        // 同saveOrUpdate
        boolean r = empService.saveOrUpdateBatch(empList);
        p(r);
    }

    public void saveOrUpdateBatch2() {
        for (int i = 0; i < empList.size(); i++) {
            Emp emp = empList.get(i);
            if (i % 2 == 0) {
                emp.setEmpno(5055 + i);
                emp.setEname("saveOrUpdateBatch" + i);
            }
        }
        // 同saveBatch2
        boolean r = empService.saveOrUpdateBatch(empList, 1);
        p(r);
    }

    //************************************************** REMOVE *****************************************************

    public void remove() {
        UpdateWrapper<Emp> wrapper = new UpdateWrapper<>();
        // 根据调用的方法, 直接拼装sql语句
        // wrapper.eq("ename", "testName2");
        // ==> Preparing: DELETE FROM emp WHERE ename = ?
        // ==> Parameters: testName2(String)

        // wrapper.apply("date_format(hiredate, 'Y%-m%-d%')={0}", "2008-09-09"); // 推荐的做法
        // ==> Preparing: DELETE FROM emp WHERE date_format(hiredate, 'Y%-m%-d%')=?
        // ==> Parameters: 2008-09-09(String)

        // wrapper.apply("date_format(hiredate, 'Y%-m%-d%')='2008-09-09'"); // 不推荐的做法
        // ==> Preparing: DELETE FROM emp WHERE date_format(hiredate, 'Y%-m%-d%')='2008-09-09'
        // ==> Parameters:

        // 构建器同样支持链式调用
        wrapper.eq("ename", "测试员工2").or().like("age", "abc");
        // ==> Preparing: DELETE FROM emp WHERE ename = ? OR age LIKE ?
        // ==> Parameters: testName2(String), testName2(String), %(String)

        // 构建器中的第一个参数 boolean condition表示是否将此条sql语句加入要执行的语句中

        // 具体结构 => src/resources/static/Wrapper结构.png
        // 具体方法 => src/resources/static/各种Wrapper主要方法.png
        // 图片转自: https://blog.csdn.net/m0_37034294/article/details/82917234
        boolean r = empService.remove(wrapper);
        p(r);
    }

    public void removeById() {
        boolean r = empService.removeById(10);
        // DELETE FROM emp WHERE empno=?
        p(r);
    }

    public void removeByIds() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(5068 + i);
        }
        boolean r = empService.removeByIds(list);
        // DELETE FROM emp WHERE empno IN ( ? , ? , ? , ? , ? )
        p(r);
    }

    public void removeByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("ename", "测试名称5");
        map.put("hiredate", new Date());
        boolean r = empService.removeByMap(map);
        // DELETE FROM emp WHERE hiredate = ? AND ename = ?
        p(r);
    }

    //************************************************** SELECT *****************************************************

    //****************************************** GET *****************************************************

    public void getById() {
        Emp emp = empService.getById(30);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE empno=?
        p(emp);
    }

    public void getOne() {
        QueryWrapper<Emp> wrapper = new QueryWrapper<>();
        wrapper.like("ename", "名称1");
        Emp emp = empService.getOne(wrapper);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE ename LIKE ?
        // 如果获取多条记录, 取第一个, 没有返回null
        p(emp);
    }

    public void getOne2() {
        QueryWrapper<Emp> wrapper = new QueryWrapper<>();
        wrapper.like("ename", "名称1");
        Emp emp = empService.getOne(wrapper, true);
        // 为false时, 在查询一条记录却返回多条记录时给与一个警告, 为true时忽略此警告
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE ename LIKE ?
        p(emp);
    }

    public void getMap() {
        QueryWrapper<Emp> wrapper = new QueryWrapper<>();
        wrapper.eq("ename", "测试员工2");
        Map<String, Object> empMap = empService.getMap(wrapper);
        // 将数据库表中不为null的字段组成一个Map返回
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE ename = ?
        p(empMap);
    }

    public void getObj() {
        QueryWrapper<Emp> wrapper = new QueryWrapper<>();
        wrapper.eq("ename", "测试员工2");
        Object emp = empService.getObj(wrapper);
        // 将数据库表中所有的字段以Object的形式返回, 并在返回多条时给与警告, 其实返回的还是一个实体类对象
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE ename = ?
        p(emp);
    }

    //****************************************** LIST *****************************************************

    public void list() {
        List<Emp> list = empService.list();
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp
        p(list);
    }

    public void list2() {
        QueryWrapper<Emp> wrapper = new QueryWrapper<>();
        wrapper.eq("ename", "测试员工2");
        List<Emp> list = empService.list(wrapper);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp where ename like ?
        p(list);
    }

    public void list3() {
        Emp emp = new Emp();
        emp.setEname("admin");
        emp.setAge(34);

        // Wrapper的另一种用法
        // 可以根据传入的实体类的参数生成eq("","")的语句
        QueryWrapper<Emp> wrapper = new QueryWrapper<>(emp);
        List<Emp> list = empService.list(wrapper);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE ename=? AND age=?
        p(list);
    }

    public void listByIds() {
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        Collection<Emp> c = empService.listByIds(ids);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE empno IN ( ? , ? , ? )
        p(c);
    }

    public void listByMap() {
        Map<String, Object> args = new HashMap<>();
        args.put("ename", "Name1");
        args.put("age", 30);
        Collection<Emp> c = empService.listByMap(args);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE ename = ? AND age = ?
        // 以Map作为条件查询
        p(c);
    }

    public void listSearch() {
        QueryWrapper<Emp> wrapper = new QueryWrapper<>();
        wrapper.like("ename", "Name1").eq("age", 30);
        Collection<Emp> c = empService.list(wrapper);
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp WHERE ename LIKE ? AND age = ?
        p(c);
        System.out.println(wrapper.getSqlSegment());
    }

    //****************************************** PAGE *****************************************************

    public void page() {
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

        Page<Emp> page = new Page<>();
        page.setAsc("ename", "hiredate");
        page.setCurrent(3);
        page.setSize(3);

        QueryWrapper<Emp> wrapper = new QueryWrapper<>();
        wrapper.select("empno", "ename", "age", "comm").like("ename","员工");
        IPage<Emp> p = empService.page(page, wrapper);

        // SELECT COUNT(1) FROM emp WHERE ename LIKE ?
        // SELECT empno,ename,age,comm FROM emp WHERE ename LIKE ? ORDER BY ename ASC,hiredate ASC LIMIT ?,?

        System.out.println(JSON.toJSONString(p.getRecords()));
        System.out.println(p.getTotal());
    }

    @Test
    public void pageMaps() {
        IPage<Map<String, Object>> p = empService.pageMaps(new Page<>());
        // SELECT COUNT(1) FROM emp
        // SELECT empno,ename,sex,age,hiredate,sal,comm,dno FROM emp LIMIT ?,?
        System.out.println(JSON.toJSONString(p));
    }


    public static void p(boolean flag) {
        if (flag) {
            System.out.println("执行成功 !");
        } else {
            System.out.println("执行失败 !");
        }
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

