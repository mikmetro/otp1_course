package UniversityDegree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniversityDegreeTest {
        @Test
        public void testPhdYears() {
            Assert.assertEquals(3, UniversityDegree.getDegree("phd"));
        }

        @Test
        public void testBscYears() {
            Assert.assertEquals(4, UniversityDegree.getDegree("bsc"));
        }

        @Test
        public void testMscYears() {
            Assert.assertEquals(6, UniversityDegree.getDegree("msc"));
        }

        @Test
        public void testNotFound() {
            Assert.assertEquals(-1, UniversityDegree.getDegree("dsabdiusa"));
        }

        @Test(expected = NullPointerException.class)
        public void testNull() {
            UniversityDegree.getDegree(null);
        }
}