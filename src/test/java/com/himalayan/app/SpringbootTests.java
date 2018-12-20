package com.himalayan.app;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.himalayan.work.users.model.Users;
import com.himalayan.work.users.service.UsersService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTests {

    @Autowired
    private UsersService usersService;

    private Users u;
    private Users user;
    private List<Users> userList;

    @Before
    public void before() {
        u = new Users();
        u.setUname("aaaa");
        u.setPword("123123");
        u.setRname("测试名称");
        u.setUserType(1);
        u.setSetups(1);
        u.setStatus(1);
        u.setCreatetime(new Date());

        userList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            user = new Users();
            user.setUname("testName" + i);
            user.setPword("123123");
            user.setRname("测试名称" + i);
            user.setUserType(1);
            user.setSetups(1);
            user.setStatus(1);
            user.setCreatetime(new Date());
            userList.add(user);
        }
    }

    public void save() {
        boolean r = usersService.save(u);
        // 添加进数据库之后可以拿到主键
        // INSERT INTO mh_users ( uname, pword, rname, userType, setups, status, createtime ) VALUES ( ?, ?, ?, ?, ?, ?, ? )
        System.out.println(r);
        System.out.println(u.getIds());
    }

    //************************************************** SAVE_AND_UPDATE *****************************************************

    public void saveOrUpdate() {
        // boolean r = usersService.saveOrUpdate(u);
        // INSERT INTO mh_users ( uname, pword, rname, userType, setups, status, createtime ) VALUES ( ?, ?, ?, ?, ?, ?, ? )

        u.setIds(6000);
        u.setUname("newAccount");
        boolean r = usersService.saveOrUpdate(u);
        // SELECT ids,uname,pword,rname,pic,userType,homeid,setups,status,createtime,creator,
        // createname,updatetime,updator,updatename FROM mh_users WHERE ids=?

        // UPDATE mh_users SET uname=?, pword=?, rname=?, userType=?, setups=?, status=?, createtime=? WHERE ids=?

        // 先判断实体类的主键, 如果主键不为空, 则进行一次查询, 查询结果仍然为空, 做添加操作
        // 但是返回的主键值依然以配置的主键生成策略优先

        System.out.println(r);
        System.out.println(u.getIds());
    }

    public void saveBatch() {
        // 循环调用
        // INSERT INTO mh_users ( uname, pword, rname, userType, setups, status, createtime ) VALUES ( ?, ?, ?, ?, ?, ?, ? )
        boolean r = usersService.saveBatch(userList);
        for (Users user : userList) {
            System.out.println(user.getIds());
        }
        p(r);
    }

    public void saveBatch2() {
        // 循环调用
        // INSERT INTO mh_users ( uname, pword, rname, userType, setups, status, createtime ) VALUES ( ?, ?, ?, ?, ?, ?, ? )
        // 每到i处, 先执行一下预编译的语句, i的值默认是1000
        boolean r = usersService.saveBatch(userList, 1);
    }

    public void saveOrUpdateBatch() {
        for (int i = 0; i < userList.size(); i++) {
            Users user = userList.get(i);
            if (i % 2 == 0) {
                user.setIds(5055 + i);
                user.setUname("saveOrUpdateBatch" + i);
            }
        }
        // 同saveOrUpdate
        boolean r = usersService.saveOrUpdateBatch(userList);
        p(r);
    }

    public void saveOrUpdateBatch2() {
        for (int i = 0; i < userList.size(); i++) {
            Users user = userList.get(i);
            if (i % 2 == 0) {
                user.setIds(5055 + i);
                user.setUname("saveOrUpdateBatch" + i);
            }
        }
        // 同saveBatch2
        boolean r = usersService.saveOrUpdateBatch(userList, 1);
        p(r);
    }

    //************************************************** REMOVE *****************************************************

    public void remove() {
        UpdateWrapper<Users> wrapper = new UpdateWrapper<>();
        // 根据调用的方法, 直接拼装sql语句
        // wrapper.eq("uname", "testName2");
        // ==> Preparing: DELETE FROM mh_users WHERE uname = ?
        // ==> Parameters: testName2(String)

        // wrapper.apply("date_format(createtime, 'Y%-m%-d%')={0}", "2008-09-09"); // 推荐的做法
        // ==> Preparing: DELETE FROM mh_users WHERE date_format(createtime, 'Y%-m%-d%')=?
        // ==> Parameters: 2008-09-09(String)

        // wrapper.apply("date_format(createtime, 'Y%-m%-d%')='2008-09-09'"); // 不推荐的做法
        // ==> Preparing: DELETE FROM mh_users WHERE date_format(createtime, 'Y%-m%-d%')='2008-09-09'
        // ==> Parameters:

        // 构建器同样支持链式调用
        wrapper.eq("uname", "testName2").or().like("rname","abc");
        // ==> Preparing: DELETE FROM mh_users WHERE uname = ? OR rname LIKE ?
        // ==> Parameters: testName2(String), testName2(String), %(String)
        
        // 构建器中的第一个参数 boolean condition表示是否将此条sql语句加入要执行的语句中

        // 具体结构 => src/resources/static/Wrapper结构.png
        // 具体方法 => src/resources/static/各种Wrapper主要方法.png
        // 图片转自: https://blog.csdn.net/m0_37034294/article/details/82917234
        boolean r = usersService.remove(wrapper);
        p(r);
    }

    public void removeById() {
        boolean r = usersService.removeById(10);
        // DELETE FROM mh_users WHERE ids=?
        p(r);
    }

    public void removeByIds() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(5068 + i);
        }
        boolean r = usersService.removeByIds(list);
        // DELETE FROM mh_users WHERE ids IN ( ? , ? , ? , ? , ? )
        p(r);
    }

    public void removeByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("rname", "测试名称5");
        map.put("createtime", new Date());
        boolean r = usersService.removeByMap(map);
        // DELETE FROM mh_users WHERE createtime = ? AND rname = ?
        p(r);
    }

    //************************************************** SELECT *****************************************************

            //****************************************** GET *****************************************************

    public void getById() {
        Users user = usersService.getById(5074);
        // SELECT ids,uname,pword,rname,pic,userType,homeid,setups,
        // status,createtime,creator,createname,updatetime,updator,updatename FROM mh_users WHERE ids=?
        p(user);
    }

    @Test
    public void getOne() {
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        wrapper.like("rname", "名称1");
        Users user = usersService.getOne(wrapper);
        // SELECT ids,uname,pword,rname,pic,userType,homeid,setups,status,createtime,
        // creator,createname,updatetime,updator,updatename FROM mh_users WHERE rname LIKE ?
        p(user);
    }

    public static void p(boolean flag) {
        if (flag) {
            System.out.println("执行成功 !");
        } else {
            System.out.println("执行失败 !");
        }
    }

    public static void p(Object o) {
        System.out.println(o);
    }
}

