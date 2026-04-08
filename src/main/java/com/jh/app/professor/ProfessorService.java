package com.jh.app.professor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.app.professor.ProfessorDTO;
import com.jh.app.professor.ProfessorMapper;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorMapper professorDAO;

	public List<ProfessorDTO> list() throws Exception {
		return professorDAO.list();
	}

	public ProfessorDTO detail(ProfessorDTO professorDTO) throws Exception {
		return professorDAO.detail(professorDTO);
	}

	public int create(ProfessorDTO professorDTO) throws Exception {
		
		return professorDAO.create(professorDTO);
	}

	public int delete(ProfessorDTO professorDTO) throws Exception {
		return professorDAO.delete(professorDTO);

	}

	public int update(ProfessorDTO professorDTO) throws Exception {
		return professorDAO.update(professorDTO);

	}

}
