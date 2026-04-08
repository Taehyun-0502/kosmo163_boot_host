package com.jh.app.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentMapper departmentDAO; //Mapper 인터페이스는 데이터 타입으로 선언 가능하다

	public List<DepartmentDTO> list() throws Exception {
		return departmentDAO.list();
	}

	public DepartmentDTO detail(DepartmentDTO departmentDTO) throws Exception {
		return departmentDAO.detail(departmentDTO);
	}

	public int create(DepartmentDTO departmentDTO) throws Exception {
		// DAO에서 create를 호출할때 리턴
		return departmentDAO.create(departmentDTO);
	}

	public int delete(DepartmentDTO departmentDTO) throws Exception {
		return departmentDAO.delete(departmentDTO);

	}

	public int update(DepartmentDTO departmentDTO) throws Exception {
		return departmentDAO.update(departmentDTO);

	}

}
