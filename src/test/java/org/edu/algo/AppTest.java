package org.edu.algo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        UnionFind unionFind = new UnionFind(10);
        unionFind.union(4, 3);
        unionFind.showComponent();

        unionFind.union(3, 8);
        unionFind.showComponent();

        unionFind.union(6, 5);
        unionFind.showComponent();

        unionFind.union(9, 4);
        unionFind.showComponent();

        unionFind.union(2, 1);
        unionFind.showComponent();
//
//        assertFalse(unionFind.connected(0, 7));
//
        assertTrue( unionFind.connected(8, 9) );
        assertFalse(unionFind.connected(5, 0));


        unionFind.union(5, 10);
        unionFind.showComponent();
    }
}
