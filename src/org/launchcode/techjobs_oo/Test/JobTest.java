package org.launchcode.techjobs_oo.Test;

import org.launchcode.techjobs_oo.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;
    @Before
    public void createJobObject() {
        test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job2 = new Job("Web Developer", new Employer("Microsoft"), new Location("Tampa"), new PositionType("Coffee Intern"), new CoreCompetency("Java Beans"));
        test_job3 = new Job("Web Designer", new Employer("Apple"), new Location("Tampa"), new PositionType("QA"), new CoreCompetency("Apples"));
        test_job4 = new Job("Full Stack Developer", new Employer("LauchCode"), new Location("St. Louis"), new PositionType("Development"), new CoreCompetency("JavaScript"));
        test_job5 = new Job("Ice cream tester", new Employer("data not available"), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(1, test_job.getId());
        assertEquals(2, test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", test_job.getName());
        assertEquals("ACME", test_job.getEmployer().toString());
        assertEquals("Desert", test_job.getLocation().toString());
        assertEquals("Quality control", test_job.getPositionType().toString());
        assertEquals("Persistence", test_job.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job3.getId() == test_job4.getId());
    }

    @Test
    public void toStringTest() {
        assertTrue(test_job5.toString().startsWith("\n"));
        assertEquals("\n" +
                "ID: " + test_job5.getId() + "\n" +
                "Name: " + test_job5.getName() + "\n" +
                "Employer: " + test_job5.getEmployer().toString() + "\n" +
                "Location: " + test_job5.getLocation().toString() + "\n" +
                "Position Type: " + test_job5.getPositionType().toString() + "\n" +
                "Core Competency: " + test_job5.getCoreCompetency().toString() + "\n" , test_job5.toString());

        assertTrue(test_job.toString().endsWith("\n"));
    }
    @Test
    public void isEqualsTrue() {
        assertEquals(true, test_job.equals(test_job));
    }
    @Test
    public void isEqualsFalse() {
        assertEquals(false, test_job.equals("test_job"));
    }
}
