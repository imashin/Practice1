package practice.practice1.hanoi;

public interface Solver {
	/**
	 * ハノイの塔を解く
	 * from の塔に積まれている上から height分の円盤を to に移動する。
	 */
	void solve(Tower from, Tower to, Tower work, int height);
}