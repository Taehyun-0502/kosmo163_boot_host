package com.jh.app.department;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {

	// list 추상메서드 접근지정자는 public abstract
	public abstract List<DepartmentDTO> list() throws Exception;

	// detail abstract 생략 가능 SELECT 할땐 부서번호가 필요하다 / DTO안에 들어있으니 DTO 선언
	public DepartmentDTO detail(DepartmentDTO departmentDTO) throws Exception;

	// create 추상메서드에 public abstract 가 무조건 들어가야 하니 둘다 생략해도 된다.
	// create 는 결과값이 int로 오니까 int써줌
	int create(DepartmentDTO departmentDTO) throws Exception;

	// update public 제외하고 abstract만 써도 됨 / 수정할 데이터를 받아야 하니까 DTO
	abstract int update(DepartmentDTO departmentDTO) throws Exception;

	// delete
	int delete(DepartmentDTO departmentDTO) throws Exception;

}
