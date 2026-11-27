// Defines the public EligibilityChecker class responsible for validating a candidate against a set of eligibility rules.
public class EligibilityChecker {

    // Declares a private array to hold multiple EligibilityRule objects.
    private EligibilityRule[] rules;

    // Defines the default constructor to initialize the array of eligibility rules.
    public EligibilityChecker() {
        // Initializes the 'rules' array with specific rule implementations.
        rules = new EligibilityRule[] {
            // Creates and adds a PercentageRule object to check minimum percentage requirements.
            new PercentageRule(),
            // Creates and adds a BacklogRule object to check maximum allowed backlogs.
            new BacklogRule(),
            // Creates and adds a GraduationYearRule object to check graduation year criteria.
            new GraduationYearRule(),
            new SkillRule()
        };
    }

    // Evaluates whether the given candidate meets all rules required by the specified job.
    public boolean evaluate(Candidate candidate, Job job) {
        // Initializes a flag assuming the candidate is eligible until any rule fails.
        boolean eligible = true;

        // Loops through every rule stored in the 'rules' array from index 0 to the end.
        for (int i = 0; i < rules.length; i++) {
            // Executes the current rule's check method and stores the boolean result.
            boolean passed = rules[i].check(candidate, job);

            // Checks if the candidate passed the current rule.
            if (passed) {
                // Prints the rule's name followed by ": PASS" to the console.
                System.out.println(rules[i].getRuleName() + " : PASS");
            // Executes if the candidate failed the current rule.
            } else {
                // Prints the rule's name followed by ": FAIL" to the console.
                System.out.println(rules[i].getRuleName() + " : FAIL");
                // Updates the overall eligibility flag to false since at least one rule failed.
                eligible = false;
            }
        }

        // Returns the final overall eligibility status (true if all rules passed, false otherwise).
        return eligible;
    }
}