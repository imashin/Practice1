package practice.practice1.hanoi;

public interface Solver {
	/**
	 * �n�m�C�̓�������
	 * from �̓��ɐς܂�Ă���ォ�� height���̉~�Ղ� to �Ɉړ�����B
	 */
	void solve(Tower from, Tower to, Tower work, int height);
}