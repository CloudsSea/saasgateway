package edu.njtu.saasgateway.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.battcn.swagger.properties.ApiDataType;
import com.battcn.swagger.properties.ApiParamType;

import edu.njtu.saasgateway.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * Created by
 */
@RestController
@RequestMapping("/users")
@Api(tags = "1.1", description = "用户管理", value = "用户管理")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(value = "条件查询（DONE）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", dataType = ApiDataType.STRING, paramType = ApiParamType.QUERY),
            @ApiImplicitParam(name = "token", value = "密码", dataType = ApiDataType.STRING, paramType = ApiParamType.QUERY),
    })
    @GetMapping
    public User query(String username, String token) {
        log.info("多个参数用  @ApiImplicitParams");
        return new User(1L, username, token);
    }

    @ApiOperation(value = "主键查询（DONE）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户编号", dataType = ApiDataType.LONG, paramType = ApiParamType.PATH),
    })
    @GetMapping("/{userId}")
    public User get(@PathVariable Long userId) {
        log.info("单个参数用  @ApiImplicitParam");
        return new User(userId, "u1", "p1");
    }

    @ApiOperation(value = "删除用户（DONE）")
    @ApiImplicitParam(name = "userId", value = "用户编号", dataType = ApiDataType.LONG, paramType = ApiParamType.PATH)
    @DeleteMapping("/{userId}")
    public void delete(@PathVariable Long userId) {
        log.info("单个参数用 ApiImplicitParam");
    }

    @ApiOperation(value = "添加用户（DONE）")
    @PostMapping
    public User post(@RequestBody User user) {
        log.info("如果是 POST PUT 这种带 @RequestBody 的可以不用写 @ApiImplicitParam");
        return user;
    }

    @ApiOperation(value = "修改用户（DONE）")
    @PutMapping("/{userId}")
    public void put(@PathVariable Long userId, @RequestBody User user) {
        log.info("如果你不想写 @ApiImplicitParam 那么 swagger 也会使用默认的参数名作为描述信息 ");
    }
}
