package practice.practice1.hanoi;

import java.util.List;

public class SolverImpl implements Solver {

	/* (�� Javadoc)
	 * solve���\�b�h�̎���
	 * @see practice.practice1.hanoi.Solver#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)
	 */
	@Override
	public List<String> solve(Tower from, Tower to, Tower work, int height, List<String> result) {

		//from����ł͂Ȃ��A���Aheight��0���傫�����A�~�Ղ��ړ�����
		if (!from.isEmpty() && height > 0) {
			solve(from, work, to, height - 1, result);
			Integer val = from.pop();
			to.push(val);
			result.add(String.format("%1$s�@���� %2$s �։~�� %3$d ���ړ�", from.getName(), to.getName(), val));
			solve(work, to, from, height - 1, result);
		}
		return result;
	}

}
