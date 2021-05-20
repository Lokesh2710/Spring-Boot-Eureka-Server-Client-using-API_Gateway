package com.user.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.user.entity.User;
@Service
public class UserServiceImpl implements UserService {

	List<User> list = List.of(
			new User(1311,"Lokesh","123456"),
			new User(1312,"Rekha","789456"),
			new User(1313,"Purnima","123852")
			);
	

	@Override
	public User getUser(Integer userId) {
		// TODO Auto-generated method stub
		
		return this.list.stream().filter(user->user.getUserId().equals(userId)).findAny().orElse(null);
	}
}
