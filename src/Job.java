// Represents a job opening and its eligibility requirements
public class Job {
    private String company;              // Hiring company name
    private String role;                 // Job title or role
    private double minimumPercentage;    // Minimum academic percentage required
    private int maximumBacklogs;         // Maximum allowed backlogs
    private int requiredGraduationYear;  // Eligible graduation year
    private String[] requiredSkills;     // Skills required for the role

    // Initializes a Job with company details and eligibility criteria
    public Job(
        String company,
        String role,
        double minimumPercentage,
        int maximumBacklogs,
        int requiredGraduationYear,
        String[] requiredSkills
    ) {
        this.company = company;
        this.role = role;
        this.minimumPercentage = minimumPercentage;
        this.maximumBacklogs = maximumBacklogs;
        this.requiredGraduationYear = requiredGraduationYear;
        this.requiredSkills = requiredSkills;
    }

    // Returns the company name
    public String getCompany() {
        return company;
    }

    // Returns the job role
    public String getRole() {
        return role;
    }

    // Returns the minimum required percentage
    public double getMinimumPercentage() {
        return minimumPercentage;
    }

    // Returns the maximum allowed backlogs
    public int getMaximumBacklogs() {
        return maximumBacklogs;
    }

    // Returns the required graduation year
    public int getRequiredGraduationYear() {
        return requiredGraduationYear;
    }

    // Returns the array of required skills
    public String[] getRequiredSkills() {
        return requiredSkills;
    }
}