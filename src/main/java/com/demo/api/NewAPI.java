package com.demo.api;

import com.demo.api.output.NewOutput;
import com.demo.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.demo.dto.NewDTO;

@RestController
public class NewAPI {

	@Autowired
	private INewService iNewService;

	@PostMapping(value = "/new")
	public NewDTO createNew(@RequestBody NewDTO model) {
		return iNewService.save(model);
	}

	@PutMapping(value = "/new/{id}")
	public NewDTO updateNew(@RequestBody NewDTO model, @PathVariable("id") long id) {
		model.setId(id);
		return iNewService.save(model);
	}

	@DeleteMapping(value = "/new")
	public void deleteNew(@RequestBody long[] ids) {
		iNewService.delete(ids);
	}
	@GetMapping(value = "/new")
	public NewOutput showNew(@RequestParam int page, @RequestParam int limit){
		NewOutput result = new NewOutput();
		result.setPage(page);
		Pageable pageable = new PageRequest(page - 1, limit);
		result.setListResult(iNewService.findAll(pageable));
		result.setTotalPage((int) Math.ceil((double) (iNewService.totalItem()) / limit));
		return result;
	}
}
