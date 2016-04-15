package com.emmashomes.swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;

@Controller
public class ContactController{
  @RequestMapping(value="contact/{id}",method=RequestMethod.POST)
  public void update(@ApiParam(name="id", value="编号", required=true)@PathVariable Integer id,
		  @ApiParam(name="name",required=false,value="名称")@RequestParam(value="name",required=false)String name) {
  }
}