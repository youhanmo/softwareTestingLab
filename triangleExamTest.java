package triangleTest;
import org.junit.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class triangleExamTest {

	static triangleExam tr  =  new triangleExam();
	int scalene = 3;
	int equilateral = 2;
	int isosceles = 1;
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testIsosceles() {
		assertEquals(tr.judgeTriangle(4, 4, 2),isosceles);
	}
	
	@Test
	public void testEquilateral() {
		assertEquals(tr.judgeTriangle(1, 1, 1),equilateral);
	}
	
	@Test
	public void testScalene() {
		assertEquals(tr.judgeTriangle(3, 4, 5),scalene);
	}
	
	@Test
	public void testNotIsosceles() {
		assertFalse(tr.judgeTriangle(4, 5, 1) == isosceles);
		//assertFalse(tr.judgeTriangle(5, 5, 5) == isosceles);
	}
	
	@Test
	public void testNotEquilateral() {
		assertFalse(tr.judgeTriangle(2, 2, 1) == equilateral);
	}
	
	@Test
	public void testNotScalene() {
		assertFalse(tr.judgeTriangle(1, 1, 1) == scalene);
		assertFalse(tr.judgeTriangle(1, 2, 1) == scalene);
		assertFalse(tr.judgeTriangle(2, 2, 1) == scalene);
		assertFalse(tr.judgeTriangle(0, 0, 0) == scalene);
	}
	
	@Test
	public void testNotTriangle() {
		assertTrue(tr.judgeTriangle(1, 1, 0) == -1);
		assertTrue(tr.judgeTriangle(0, 0, 0) == -1);
		assertTrue(tr.judgeTriangle(-1, -1, 0) == -1);
	}
	
	@Test
	public void testInvalidTriangle() {
		assertTrue(tr.judgeTriangle(1, 1, 2) == -1);
	}

}
