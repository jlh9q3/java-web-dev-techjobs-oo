package Tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class JobTest {
    private Job job1;
    private Job job2;
    private Job job3;
    private Job job4;

    @BeforeClass
    public static void createJobTestObjects() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"),
                new Location("St. Louis"), new PositionType("Front-end developer"),
                new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"),
                new PositionType("UX"), new CoreCompetency("Taste"));
        Job job4 = new Job();

    }

    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    public void testSettingJobId() {
        Job job4 = new Job();
        Job job5 = new Job();

        assertTrue(job5.getId() - job4.getId() == 1);
    }

    @Test
    public void testSettingJobId2() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer",
                new Employer("LaunchCode"),
                new Location("St. Louis"),
                new PositionType("Front-end developer"),
                new CoreCompetency("JavaScript"));
        assertTrue(job2.getId() - job1.getId() == 1);
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals("Product tester", job1.getName());

    }

    @Test
    public void testJobConstructorSetsAllFields1() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals("ACME", job1.getEmployer().toString());
    }

    @Test
    public void testJobConstructorSetsAllFields2() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals("Desert", job1.getLocation().toString());

    }

    @Test
    public void testJobConstructorSetsAllFields3() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals("Quality control", job1.getPositionType().getValue());

    }

    @Test
    public void testJobConstructorSetsAllFields4() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals("Persistence", job1.getCoreCompetency().toString());
    }

    @Test
    public void testInstanceOf() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertThat(job1, instanceOf(Job.class));
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals(false, job1.getId() == job2.getId());
    }

    @Test
    public void testToString1() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals("\n" +
                "ID: " + job1.getId() +
                "\nName: " + job1.getName() +
                "\nEmployer: " + job1.getEmployer() +
                "\nLocation: " + job1.getLocation() +
                "\nPosition Type: " + job1.getPositionType() +
                "\nCore Competency: " + job1.getCoreCompetency() +
                "\n", job1.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {

        Job job10 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        job10.getEmployer().setValue("");
        job10.getPositionType().setValue("");
        String output = String.format("\nID: %d\n" +
                "Name: %s\n" +
                "Employer: No data available\n" +
                "Location: %s\n" +
                "Position Type: No data available\n" +
                "Core Competency: %s\n", job10.getId(), job10.getName(), job10.getLocation(), job10.getCoreCompetency());
        assertEquals(output, job10.toString());
    }
}