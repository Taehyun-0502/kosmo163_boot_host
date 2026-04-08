package com.jh.app.professor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jh.app.professor.ProfessorDTO;

@Controller
@RequestMapping("/professor/*")
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
	@GetMapping("list")
	// 리퀘스트 대신 인터페이스 모델 모델=jsp로 운반 해주는 객체, 생명주기는 리퀘스트와 같다
	public ModelAndView list(ModelAndView mv) throws Exception {
		List<ProfessorDTO> ar = professorService.list();

		// request와 비슷한 역할, Spring이 제공
		mv.addObject("list", ar);
		mv.setViewName("professor/list");

		return mv;
	}

}
