package practice.practice1.hanoi.jorsef;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import practice.practice1.hanoi.Solver;
import practice.practice1.hanoi.Tower;

public class SolverImplTest {

	@Test
	public void testSolve() {
		Tower a =  new Tower("A", 1);
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
		List<String> result = solver.solve(a, b, c, 1, new ArrayList<String>());
		assertEquals(1, result.size());
		assertEquals("A�@���� B �։~�� 1 ���ړ�", result.get(0));
		assertTrue(a.isEmpty());
		assertFalse(b.isEmpty());
		assertTrue(c.isEmpty());
		assertArrayEquals(new Integer[] {1}, b.toArray());
	}

	@Test
	public void testSolve2() {
		Tower a =  new Tower("A", 2);
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
		List<String> result = solver.solve(a, b, c, 2, new ArrayList<String>());
		assertEquals(3, result.size());
		assertEquals("A�@���� C �։~�� 1 ���ړ�", result.get(0));
		assertEquals("A�@���� B �։~�� 2 ���ړ�", result.get(1));
		assertEquals("C�@���� B �։~�� 1 ���ړ�", result.get(2));
		assertTrue(a.isEmpty());
		assertFalse(b.isEmpty());
		assertTrue(c.isEmpty());
		assertArrayEquals(new Integer[] {1,2}, b.toArray());
	}

	@Test
	public void testSolve3() {
		Tower a =  new Tower("A", 3);
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
		List<String> result = solver.solve(a, b, c, 3, new ArrayList<String>());
//		System.out.println(result);
		assertEquals(7, result.size());
		assertEquals("A�@���� B �։~�� 1 ���ړ�", result.get(0));
		assertEquals("A�@���� C �։~�� 2 ���ړ�", result.get(1));
		assertEquals("B�@���� C �։~�� 1 ���ړ�", result.get(2));
		assertEquals("A�@���� B �։~�� 3 ���ړ�", result.get(3));
		assertEquals("C�@���� A �։~�� 1 ���ړ�", result.get(4));
		assertEquals("C�@���� B �։~�� 2 ���ړ�", result.get(5));
		assertEquals("A�@���� B �։~�� 1 ���ړ�", result.get(6));
		assertTrue(a.isEmpty());
		assertFalse(b.isEmpty());
		assertTrue(c.isEmpty());
		assertArrayEquals(new Integer[] {1,2,3}, b.toArray());
	}
}
