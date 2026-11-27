// Defines the public PercentageRule class, which inherits from the abstract EligibilityRule parent class.
public class PercentageRule extends EligibilityRule {
    // Indicates that the following method overrides the abstract getRuleName() method from EligibilityRule.
    @Override 
    // Defines the method that returns the display name of this specific eligibility rule.
    public String getRuleName() {
        // Returns the string "Percentage" to identify this rule in evaluation output.
        return "Percentage";
    }
    // Indicates that the following method overrides the abstract check() method from EligibilityRule.
    @Override 
    // Evaluates whether the given candidate satisfies the minimum percentage requirement for the specified job.
    public boolean check(Candidate candidate, Job job) {
        // Returns true if the candidate's percentage is greater than or equal to the job's minimum required percentage; otherwise false.
        return candidate.getPercentage() >= job.getMinimumPercentage();
    }
}