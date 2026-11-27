// Defines a public abstract class named EligibilityRule that serves as a blueprint for all placement eligibility rules.
public abstract class EligibilityRule {

    // Declares an abstract method that subclasses must implement to return the display name of the rule.
    public abstract String getRuleName();

    // Declares an abstract method that subclasses must implement to evaluate whether a candidate meets the job's criteria.
    public abstract boolean check(Candidate candidate, Job job);
}