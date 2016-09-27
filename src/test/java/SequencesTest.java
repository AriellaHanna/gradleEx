import org.junit.Test;
import static org.junit.Assert.*;
import ard71.Sequences;
public class SequencesTest
{
	@Test
	public void testTri1() {
		assertEquals(Sequences.tri(1), 1);
	}
	
	@Test
	public void testTri2() {
		assertEquals(Sequences.tri(2), 3);
	}
	
	@Test
	public void testTri4() {
		assertEquals(Sequences.tri(4), 10);
	}
	
	@Test
	public void testLazy0() {
		assertEquals(Sequences.lazy(0), 1);
	}
	
	@Test
	public void testLazy3() {
		assertEquals(Sequences.lazy(3), 7);
	}
	
	@Test
	public void testLazy5() {
		assertEquals(Sequences.lazy(5), 16);
	}
}
