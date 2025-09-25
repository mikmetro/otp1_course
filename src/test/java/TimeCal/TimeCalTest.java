package TimeCal;

import junit.framework.TestCase;

public class TimeCalTest extends TestCase {
    public void testCalculateTime() {
        assertEquals(1.0, TimeCal.calculateTime(100,100));
    }
}