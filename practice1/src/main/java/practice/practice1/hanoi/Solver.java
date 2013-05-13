package practice.practice1.hanoi;

import java.util.List;

public interface Solver {
	/**
	 * �n�m�C�̓�������
	 * from �̓��ɐς܂�Ă���ォ�� height���̉~�Ղ� to �Ɉړ�����B
	 * @param from	�ړ���
	 * @param to	�ړ���
	 * @param work	3�{�̓��̂����A�ړ����ł��ړ���ł��Ȃ���
	 * @param height	�ړ��Ώۂ̉~�Ղ̐��A�ړ����̓��̏ォ�� height �����ړ��ΏۂƂȂ�
	 * @param result	�ړ�����	�����̈ړ����ʂ͂��̌Ăяo���܂łɂ��łɎ��{�����ړ��菇�̃��X�g�������Ă���
	 * @return			�ړ�����
	 *	�ړ����ʂɂ́A�ړ��菇�̃��X�g������B �ړ��菇�́@"�����@���� �~�~ �։~�� �� ���ړ�"�@��
	 *	�t�H�[�}�b�g�ňړ��̏��Ƀ��X�g�ɓo�^����Ă���B�@�����ŗ^����ꂽ�ړ����ʂɂ��̌Ăяo���ňړ������菇��ǉ�����
	 *	�Ԃ�
	 */
	List<String> solve(Tower from, Tower to, Tower work, int height, List<String> result);
}