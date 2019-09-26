package com.woniu.web.controller.personnel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Role;
import com.woniu.service.IRoleService;

@Controller
@RequestMapping("roles")
public class RoleController {
	@Autowired
	private IRoleService roleService;
	
	@PostMapping
	@ResponseBody()
	public String save(@RequestBody Role role) {
		roleService.save(role);
		return "true";
	}

	@DeleteMapping
	@ResponseBody
	public void delete(Integer roleid) {
		roleService.delete(roleid);
	}

	@PutMapping
	@ResponseBody
	public String update(Role role) {
		roleService.update(role);
		return "true";
	}

	@GetMapping(value="{roleid}")
	@ResponseBody
	public Role findOne(@PathVariable("roleid") int roleid) {
		return roleService.find(roleid);
	}

	@GetMapping
	@ResponseBody
	public List<Role> findAll() {
		return roleService.findAll();
	}
}
