package pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserPojos {
    private int id;
    private String name;
    private String email;
    private String department;
    private boolean isPermanent;
    private double salary;
    private Address address;
    private List<Projects> projects;
    private List<String> skills;

    public UserPojos(int id, String name, String email, String department, boolean isPermanent){
        this.id=id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.isPermanent = isPermanent;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(String... skills) {
        /*for (int i = 0; i < skills.length; i++) {
            this.skills.add(skills[i]);
        }
        This code replaced with the below line(same meaning*/

        this.skills = new ArrayList<>(); // initialize before use
        this.skills.addAll(Arrays.asList(skills));

    }



}
