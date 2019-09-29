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

import com.woniu.domain.Tree;
import com.woniu.service.ITreeService;


@Controller
@RequestMapping("trees")
public class TreeController {

@Autowired
   private ITreeService service;
@PostMapping
@ResponseBody()
public void save(@RequestBody Tree tree) {
	service.save(tree) ;
}
@DeleteMapping
@ResponseBody
public void delete(Integer treeid) {
	service.delete( treeid);
}
@PutMapping
@ResponseBody
public void update(Tree tree) {
	service.update(tree);
}
@GetMapping
@ResponseBody
public List<Tree> findAll(){
	return service.findAll();
}
@GetMapping(value="{treeid}")
@ResponseBody
public Tree findOne(@PathVariable Integer treeid) {
	return service.find(treeid);
}

}
