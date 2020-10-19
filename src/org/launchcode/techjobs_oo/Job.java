package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private static final String DEFAULT_MESSAGE = "No Data Available";
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
//    private

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Data not available");
        }
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        if (employer == null) {
            throw new IllegalArgumentException("Data not available");
        }
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        if (location == null) {
            throw new IllegalArgumentException("Data not available");
        }
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        if (coreCompetency == null) {
            throw new IllegalArgumentException("Data not available");
        }
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        boolean nullName = (String.valueOf(name) == null || String.valueOf(name) == "null" || String.valueOf(name) == "");
        boolean nullEmp = (String.valueOf(employer) == null || String.valueOf(employer) == "null" || String.valueOf(employer) == "");
        boolean nullLocate = (String.valueOf(location) == null || String.valueOf(location) == "null" || String.valueOf(location) == "");
        boolean nullPoTy = (String.valueOf(positionType) == null || String.valueOf(positionType) == "null" || String.valueOf(positionType) == "");
        boolean nullCorComp = (String.valueOf(coreCompetency) == null || String.valueOf(coreCompetency) == "null" || String.valueOf(coreCompetency) == "");

        String noData = "No data available";

        if (name.equals("")|| name.equals(null)) {
            name = noData;
        }
        if (employer.getValue().equals("")|| employer.getValue().equals(null)) {
            employer.setValue("No data available");
        }
        if (location.getValue().equals("")|| location.getValue().equals(null)) {
            location.setValue("No data available");;
        }
        if (positionType.getValue().equals("")|| positionType.getValue().equals(null)) {
            positionType.setValue("No data available");;
        }
        if (coreCompetency.getValue().equals("")|| coreCompetency.getValue().equals(null)) {
            coreCompetency.setValue("No data available");;
        }
        return "\n" +
                "ID: " + id +
                "\nName: " + name +
                "\nEmployer: " + employer +
                "\nLocation: " + location +
                "\nPosition Type: " + positionType +
                "\nCore Competency: " + coreCompetency +
                "\n";

    }
}
