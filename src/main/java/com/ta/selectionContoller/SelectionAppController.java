package com.ta.selectionContoller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ta.dao.SelectionAppDao;
import com.ta.dto.SelectionAppDto;

@Controller

public class SelectionAppController 
{
	@Autowired
	SelectionAppDao selectionAppDao;
	
	@RequestMapping("/createSelectionAppDto")
	public ModelAndView createSelectionAppDto() 
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createSelectionApp.jsp");
		mv.addObject("SelectionAppDto",new SelectionAppDto());
		return mv;
	}
	
	@RequestMapping("/saveSelectionAppDto")
	public ModelAndView saveSelectionAppDto(@ModelAttribute SelectionAppDto selectionAppDto) 
	{
		selectionAppDao.saveSelectionAppDto(selectionAppDto);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("message.jsp");
		mv.addObject("message","Applicatiion is saved");
		return mv;
	}
	
	@RequestMapping("/viewSelectionAppDto")
	public ModelAndView getAllselectionAppDto() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displaySelectionAppDto.jsp");
		mv.addObject("selectionAppDto",selectionAppDao.getAllSelectionAppDto());
		return mv;
	}
	
	@RequestMapping("/edit")
	public ModelAndView editStudent(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("editselectionAppDto.jsp");
		mv.addObject("selectionAppDto",selectionAppDao.getSelectionAppDtoById(id));
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteStudent(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		selectionAppDao.deleteSelectionAppDto(id);
		mv.setViewName("message.jsp");
		mv.addObject("message","student is updated");
		return mv;
	}
	
	@RequestMapping("/updateselectionAppDto")
	public ModelAndView updateStudent(@ModelAttribute SelectionAppDto selectionAppDto) 
	{
		selectionAppDao.updateSelectionAppDto(selectionAppDto);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("message.jsp");
		mv.addObject("message","selectionAppDto is updated");
		return mv;
	}


}
