package Test;

import jdk.jfr.StackTrace;
import org.launchcode.techjobs_oo.Job;
import org.junit.Before;

public class JobTest {

    Job test_job;
    Job test_job2;

    @Before
    public void createJobObject() {
        test_job = new Job("Web Designer", "Apple", "Saint Petersburg", "QA", "Apples");
        test_job2 = new Job("Web Developer", "Microsoft", "Tampa", "Coffee Intern", "Java Beans");
    }

    @Test
    public void testSettingJobId() {
        assertEquals(,test_job.get(), );
    }
}
