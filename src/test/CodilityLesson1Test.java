package test;

import static org.junit.Assert.*;

import org.junit.Test;

import pckg.CodilityLesson1;

public class CodilityLesson1Test {

	@Test
	public void testSolutionWithValidNumber() {
		assertTrue(CodilityLesson1.solution(1041) == 5);
	}
	
	@Test
	public void testSolutionWithZero() {
		assertTrue(CodilityLesson1.solution(0) == 0);
	}
	
	@Test
	public void testSolutionWithOne() {
		assertTrue(CodilityLesson1.solution(1) == 0);
	}
	
	@Test
	public void testSolutionWithBiggestPieceOfZeroesAtTheEnd() {
		assertTrue(CodilityLesson1.solution(1120) == 3);
	}
	
	@Test
	public void testSolutionWithBiggestPieceOfZeroesAtTheEndFalse() {
		assertFalse(CodilityLesson1.solution(1120) == 5);
	}
	
	@Test
	public void testSolutionWithInvaliArgument() {
		assertThrows(IllegalArgumentException.class, () -> {
			CodilityLesson1.solution(-1);
		});
	}
}
