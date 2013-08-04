/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2013, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Oracle and Java are registered trademarks of Oracle and/or its affiliates. 
 * Other names may be trademarks of their respective owners.]
 *
 * ------------------
 * TickUnitsTest.java
 * ------------------
 * (C) Copyright 2007-2013, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 02-Aug-2007 : Version 1 (DG);
 *
 */

package org.jfree.chart.axis;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.jfree.chart.TestUtilities;

/**
 * Tests for the {@link TickUnits} class.
 */
public class TickUnitsTest extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(TickUnitsTest.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public TickUnitsTest(String name) {
        super(name);
    }

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    public void testSerialization() {
        TickUnits t1 = (TickUnits) NumberAxis.createIntegerTickUnits();
        TickUnits t2 = (TickUnits) TestUtilities.serialised(t1);
        assertEquals(t1, t2);
    }

    /**
     * Confirm that cloning works.
     */
    public void testCloning() throws CloneNotSupportedException {
        TickUnits t1 = (TickUnits) NumberAxis.createIntegerTickUnits();
        TickUnits t2 = (TickUnits) t1.clone();
        assertTrue(t1 != t2);
        assertTrue(t1.getClass() == t2.getClass());
        assertTrue(t1.equals(t2));
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    public void testEquals() {
        TickUnits t1 = (TickUnits) NumberAxis.createIntegerTickUnits();
        TickUnits t2 = (TickUnits) NumberAxis.createIntegerTickUnits();
        assertTrue(t1.equals(t2));
        assertTrue(t2.equals(t1));
    }

}
