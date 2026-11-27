public class SkillRule extends EligibilityRule {          // Rule to verify required job skills

    @Override                                               // Overrides method from EligibilityRule
    public String getRuleName() {                           // Gets the display name of this rule
        return "Skills";                                    // Returns rule name "Skills"
    }                                                       // End of getRuleName

    @Override                                               // Overrides method from EligibilityRule
    public boolean check(Candidate candidate, Job job) {    // Checks if candidate has all required skills
        String[] requiredSkills = job.getRequiredSkills();  // Get list of required skills from job

        for (int i = 0; i < requiredSkills.length; i++) {   // Loop through each required skill
            if (!candidate.hasSkill(requiredSkills[i])) {   // Check if candidate is missing this skill
                return false;                               // Fail check if any skill is missing
            }                                               // End if missing skill
        }                                                   // End loop over required skills

        return true;                                        // Pass check when all skills match
    }                                                       // End of check
}                                                           // End of SkillRule class