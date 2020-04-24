package com.user.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@RequestMapping("/User")
public interface UserApi {

	/**
	 * 
	 * 查看当前服务状态~~~
	 * @return (* ￣3)(ε￣ *)
	 */
	@GetMapping("/alive")
	public String alive();
	
	@GetMapping("/getById")
	public String getById(Integer id);
	
	
	@PostMapping("/postPserson")
	public Person postPserson(@RequestBody Person person);
}
