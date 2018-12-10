package edu.njtu.saasgateway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import edu.njtu.saasgateway.mapper.PicMapper;
import edu.njtu.saasgateway.mapper.UserMapper;
import edu.njtu.saasgateway.model.Pic;
import edu.njtu.saasgateway.model.User;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(SpringBootMybatisApplicationTests.class);

    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private PicMapper picMapper;

    @Test
    public void test1() throws Exception {
//        final User user1 = new User("u1", "p1");
//        final User user2 = new User("u1", "p2");
//        final User user3 = new User("u3", "p3");
//        userMapper.insertSelective(user1);
//        log.info("[user1回写主键] - [{}]", user1.getUserId());
//        userMapper.insertSelective(user2);
//        log.info("[user2回写主键] - [{}]", user2.getUserId());
//        userMapper.insertSelective(user3);
//        log.info("[user3回写主键] - [{}]", user3.getUserId());
//        final int count = userMapper.countByUsername("u1");
//        log.info("[调用自己写的SQL] - [{}]", count);
//
//        // TODO 模拟分页
//        userMapper.insertSelective(new User("u4", "p4"));
//        userMapper.insertSelective(new User("u5", "p5"));
//        userMapper.insertSelective(new User("u6", "p6"));
//        userMapper.insertSelective(new User("u7", "p7"));
//        userMapper.insertSelective(new User("u8", "p8"));
//        userMapper.insertSelective(new User("u9", "p9"));
//        userMapper.insertSelective(new User("u10", "p10"));
//        userMapper.insertSelective(new User("u11", "p11"));
//        userMapper.insertSelective(new User("u12", "p12"));
//        userMapper.insertSelective(new User("u13", "p13"));
//        // TODO 分页 + 排序 this.userMapper.selectAll() 这一句就是我们需要写的查询，有了这两款插件无缝切换各种数据库
//        final PageInfo<Object> pageInfo = PageHelper.startPage(1, 10).setOrderBy("user_id desc").doSelectPageInfo(() -> this.userMapper.selectAll());
//        log.info("[lambda写法] - [分页信息] - [{}]", pageInfo.toString());
//
//        PageHelper.startPage(1, 10).setOrderBy("user_id desc");
//        final PageInfo<User> userPageInfo = new PageInfo<>(this.userMapper.selectAll());
//        log.info("[普通写法] - [{}]", userPageInfo);
    	final Pic pic = new Pic(1L, "p1");
//    	picMapper.insertSelective(pic);
    }


}