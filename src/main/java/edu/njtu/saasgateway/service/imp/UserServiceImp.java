package edu.njtu.saasgateway.service.imp;

import org.springframework.stereotype.Service;

import edu.njtu.saasgateway.service.UserService;
 
@Service("userService")
public class UserServiceImp implements UserService{


	@Override
	public boolean login(String userName, String token) {
		// TODO Auto-generated method stub
		return (userName.equals("saas") && token.equals("123456"));

	}
}