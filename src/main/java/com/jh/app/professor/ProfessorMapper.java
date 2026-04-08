package com.jh.app.professor;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfessorMapper {
	
	//list
	public abstract List<ProfessorDTO> list() throws Exception;
	
	//detail
	public ProfessorDTO detail(ProfessorDTO professorDTO) throws Exception;
	
	//create
	public int create(ProfessorDTO professorDTO) throws Exception;
	
	//update
	public int update(ProfessorDTO professorDTO) throws Exception;

	//delete
	public int delete(ProfessorDTO professorDTO) throws Exception;

}
