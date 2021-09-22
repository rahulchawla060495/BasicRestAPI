package com.rest.webservice.restfulservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
public static List<User> users=new ArrayList<User>();
public static int initial_user_cnt=3;
static 
{
users.add(new User(1,"Rahul",new Date()));
users.add(new User(2,"Neetu",new Date()));
users.add(new User(3,"Madhav",new Date()));
}
public List<User> findall()
{
return users;	
}
public User save(User user)
{
	if(user.getId()==0)
	{
		user.setId(++initial_user_cnt);
	}
	users.add(user);
	return user;
}
public User findbyId(int id)
{
  Optional<User> user_opt=users.stream().filter(i-> i.getId()==id).findAny();
  if(user_opt.isPresent())
  {
	  return user_opt.get();
  }
  return null;
}
public User deleteById(int id)
{
	Optional<User> user_opt=users.stream().filter(i-> i.getId()==id).findAny();
	  if(user_opt.isPresent())
	  {
		  users.remove(user_opt.get());
	  }
	  return user_opt.get();
}
}
