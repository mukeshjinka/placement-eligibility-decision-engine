// Represents a placement candidate and their academic/skill profile
public class Candidate {
    private String name;           // Candidate's full name
    private double percentage;     // Academic score percentage
    private int backlogs;          // Number of active backlogs
    private int graduationYear;    // Year of graduation
    private String[] skills;       // List of candidate's skills

    // Initializes a Candidate with their details and skills
    public Candidate(
        String name,
        double percentage,
        int backlogs,
        int graduationYear,
        String[] skills
    ) {
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
        this.skills = skills;
    }

    // Returns the candidate's name
    public String getName() {
        return name;
    }

    // Returns the candidate's percentage
    public double getPercentage() {
        return percentage;
    }

    // Returns the number of backlogs
    public int getBacklogs() {
        return backlogs;
    }

    // Returns the graduation year
    public int getGraduationYear() {
        return graduationYear;
    }

    // Checks if the candidate has the required skill (case-insensitive)
    public boolean hasSkill(String requiredSkill) {
        for (int i = 0; i < skills.length; i++) {
            if (skills[i].equalsIgnoreCase(requiredSkill)) {
                return true;
            }
        }

        return false;
    }
}