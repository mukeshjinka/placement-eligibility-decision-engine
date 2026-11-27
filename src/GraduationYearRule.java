// Defines the public GraduationYearRule class, which inherits from the abstract EligibilityRule parent class.
public class GraduationYearRule extends EligibilityRule {
    // Indicates that the following method overrides the abstract getRuleName() method from EligibilityRule.
    @Override
    // Defines the method that returns the display name of this specific eligibility rule.
    public String getRuleName() {
        // Returns the string "Graduation Year" to identify this rule in evaluation output.
        return "Graduation Year";
    }
    // Indicates that the following method overrides the abstract check() method from EligibilityRule.
    @Override
    // Evaluates whether the given candidate satisfies the graduation year requirement for the specified job.
    public boolean check(Candidate candidate, Job job) {
        // Returns true if the candidate's graduation year matches the job's required graduation year; otherwise false.
        return candidate.getGraduationYear() == job.getRequiredGraduationYear();
    }
}