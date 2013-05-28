package practice.practice1.hanoi.no1memory;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import practice.practice1.hanoi.Solver;
import practice.practice1.hanoi.Tower;
import practice.practice1.hanoi.no1memory.SolverImpl;

/**
 * @author araki
 *
 */
public class SolverImplTest {

	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} �̂��߂̃e�X�g�E���\�b�h�B
	 * �~�Ղ̐�=1�Aheight=1�̏ꍇ�i�S�Ẳ~�Ղ��ړ��j
	 */
	@Test
	public void testSolve1() {
		Tower a =  new Tower("A", 1);
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
		List<String> result = solver.solve(a, b, c, 1, new ArrayList<String>());
		assertEquals(1, result.size());
		assertEquals("A�@���� B �։~�� 1 ���ړ�", result.get(0));
	}

	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} �̂��߂̃e�X�g�E���\�b�h�B
	 * �~�Ղ̐�=3�Aheight=3�̏ꍇ�i�S�Ẳ~�Ղ��ړ��j
	 */
	@Test
	public void testSolve2() {
		Tower a =  new Tower("A", new Integer[]{1,3,5});
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
		List<String> result = solver.solve(a, b, c, 3, new ArrayList<String>());
		assertEquals(7, result.size());
		assertEquals("A�@���� B �։~�� 1 ���ړ�", result.get(0));
		assertEquals("A�@���� C �։~�� 3 ���ړ�", result.get(1));
		assertEquals("B�@���� C �։~�� 1 ���ړ�", result.get(2));
		assertEquals("A�@���� B �։~�� 5 ���ړ�", result.get(3));
		assertEquals("C�@���� A �։~�� 1 ���ړ�", result.get(4));
		assertEquals("C�@���� B �։~�� 3 ���ړ�", result.get(5));
		assertEquals("A�@���� B �։~�� 1 ���ړ�", result.get(6));
	}
	
	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} �̂��߂̃e�X�g�E���\�b�h�B
	 * �~�Ղ̐�=3�Aheight=2�̏ꍇ�i�ꕔ�̉~�Ղ��ړ��j
	 */
	@Test
	public void testSolve3() {
		Tower a =  new Tower("A", new Integer[]{1,3,5});
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
		List<String> result = solver.solve(a, b, c, 2, new ArrayList<String>());
		assertEquals(3, result.size());
		assertEquals("A�@���� C �։~�� 1 ���ړ�", result.get(0));
		assertEquals("A�@���� B �։~�� 3 ���ړ�", result.get(1));
		assertEquals("C�@���� B �։~�� 1 ���ړ�", result.get(2));
	}
	
	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} �̂��߂̃e�X�g�E���\�b�h�B
	 * �~�Ղ̐�=3�Aheight=0�̏ꍇ�i�ړ����Ȃ��j
	 */
	@Test
	public void testSolve4() {
		Tower a =  new Tower("A", new Integer[]{1,3,5});
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
		List<String> result = solver.solve(a, b, c, 0, new ArrayList<String>());
		assertEquals(0, result.size());
	}
	
	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} �̂��߂̃e�X�g�E���\�b�h�B
	 * �~�Ղ̐�=0�Aheight=1�̏ꍇ�i�ړ��Ώۂ̉~�Ղ��Ȃ��j
	 */
	@Test
	public void testSolve5() {
		Tower a =  new Tower("A");
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
		List<String> result = solver.solve(a, b, c, 1, new ArrayList<String>());
		assertEquals(0, result.size());
	}
}
