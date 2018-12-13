package edu.njtu.saasgateway.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController("/abc")
public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);
    
    @GetMapping(value = {"/index", "/"})
    public String index() {
        System.out.println("/index");
        return "index";
    }
    
    @GetMapping("/login")
    public String login() {
        System.out.println("/login");
        return "login";
    }
    
    @PostMapping("/loginPost")
    public String loginPost(String input_username, String input_password, HttpSession session) {

//        User user = new User();
//        user.setUsername(input_username);
//        user.setPassword(input_password);

        Map<String, Object> map = new HashMap<>();
//        if (userService.login(input_username, input_password) == null) {
//            map.put("success", false);
//            map.put("message", "用户名或密码错误");
//            System.out.println("/doLogin");
//            return "redirect:/login";
//        }
        // 设置session
//        session.setAttribute(WebSecurityConfig.SESSION_KEY, input_username);
        map.put("success", true);
        map.put("message", "登录成功");
        return "index";
    }
}
