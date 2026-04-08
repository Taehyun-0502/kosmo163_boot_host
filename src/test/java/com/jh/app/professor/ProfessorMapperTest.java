package com.jh.app.professor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProfessorMapperTest {

	// 테스트할 객체를 @Autowired
	@Autowired
	private ProfessorMapper professorMapper;

	@Test
	void testList() throws Exception {
		List<ProfessorDTO> ar = professorMapper.list();

		assertNotNull(ar);
	}

	@Test
	void testDetail() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P001");

		professorDTO = professorMapper.detail(professorDTO);

		assertNotNull(professorDTO);
	}

	@Test
	void testCreate() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P200");
		professorDTO.setProfessorName("김대기");
		professorDTO.setProfessorSsn("800101-1234567");
		professorDTO.setProfessorAddress("한라원앤원타워");
		professorDTO.setDepartmentNo("001");

		int result = professorMapper.create(professorDTO);

		assertEquals(1, result);
	}

	@Test
	void testUpdate() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P200");
		professorDTO.setProfessorName("김대기");
		professorDTO.setProfessorSsn("810101-1234567");
		professorDTO.setProfessorAddress("한라원앤원타워 B동 306호");
		professorDTO.setDepartmentNo("001");

		int result = professorMapper.update(professorDTO);

		assertEquals(1, result);
	}

	@Test
	void testDelete() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P200");

		int result = professorMapper.delete(professorDTO);

		assertEquals(1, result);
	}

}
