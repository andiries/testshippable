/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.netorium.testshippable;

import junit.framework.TestCase;

/**
 *
 * @author riesa
 */
public class DoSomethingClassTest extends TestCase {
    
    public DoSomethingClassTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of doSomething method, of class DoSomethingClass.
     */
    public void testDoSomething() {
        System.out.println("testing doSomething");
        DoSomethingClass instance = new DoSomethingClass();
        instance.doSomething();
        assertTrue(true);
    }
}
