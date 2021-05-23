package Data_Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id", "employee_name", "employee_salary", "employee_age", "profile_image"})
public class User {
    private String id;
    private String employee_name;
    private String employee_salary;
    private String employee_age;
    private String profile_image;

    User() {
        this.id = "";
        this.employee_name = "";
        this.employee_salary = "";
        this.employee_age = "";
        this.profile_image = "";
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("employee_name")
    public String getEmployee_name() {
        return employee_name;
    }

    @JsonProperty("employee_name")
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    @JsonProperty("employee_salary")
    public String getEmployee_salary() {
        return employee_salary;
    }

    @JsonProperty("employee_salary")
    public void setEmployee_salary(String employee_salary) {
        this.employee_salary = employee_salary;
    }

    @JsonProperty("employee_age")
    public String getEmployee_age() {
        return employee_age;
    }

    @JsonProperty("employee_age")
    public void setEmployee_age(String employee_age) {
        this.employee_age = employee_age;
    }

    @JsonProperty("profile_image")
    public String getProfile_image() {
        return profile_image;
    }

    @JsonProperty("profile_image")
    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
}
