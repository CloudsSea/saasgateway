package edu.njtu.saasgateway;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.那么;
import edu.njtu.saasgateway.service.imp.UserServiceImp;

/**
 * @RunWith(Cucumber.class) 这是一个运行器 ，指用Cucumber来运行测试
 * @CucumberOptions中的features，用于指定我们项目中要运行的feature的目录
 * @CucumberOptions中的format，用于指定我们项目中要运行时生成的报告，并指定之后可以在target目录中找到对应的测试报告
 * @CucumberOptions中的glue，用于指定项目运行时查找实现step定义文件的目录
 * 
 * 												在实际项目中，随着项目的进行，一个测试工程可能由多个feature文件组成，并且每个feature文件中可能也是由多个scenario组成。默认情况下，
 *                                                 每次运行是运行所有feature中的所有scenario。这样可能导致正常情况下运行一次测试脚本，需要非常长的时间来等待测试结果。
 *                                                 但是实际过程中，测试用例是有优先级等区分的。比如smokeTest、regressionTest等。或者有时候会有特别小部分的用例，比如等级是critical，
 *                                                 这些用例需要长时间运行来监测系统是否没有白页或者页面404等现象。
 *                                                 所以我们必须区分开所有的scenario，可以使我们在启动测试脚本时，可以根据我们需要来运行哪些模块的scenaro。这时我们可以使用Tags
 *                                                 在Cucumber里Tag是直接在Feature、Scenari或Scenario
 *                                                 Outline关键字前给feature或scenario添加任意数量的前缀为@的tags，多个tag用空格来分隔
 * @author
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration // 不加此注解，bean会注入不进去
@SpringBootTest // 不加此注解会找不到bean
public class UserCucumberStepDefinitions {

	@Resource(name = "userService")
	private UserServiceImp service;

	private String username;

	private String password;


	@假如("^:我以\"([^\"]*)\"登录$")
	public void 我以_登录(String arg1) throws Throwable {
		this.username = arg1;
	}

	@假如("^:输入的密码为\"([^\"]*)\"$")
	public void 输入的密码为(String arg1) throws Throwable {
		this.password = arg1;
	}


	@那么("^:显示为\"([^\"]*)\"$")
	public void 显示为(String arg1) throws Throwable {
		boolean isLogin = service.login(username, password);
		if (isLogin) {
			System.out.println("登录成功！显示：" + arg1);
			Assert.assertEquals("success", arg1);
		}
	}	
}
