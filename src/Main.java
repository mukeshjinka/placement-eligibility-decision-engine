import java.util.Scanner;

// Entry point for evaluating candidate placement eligibility
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read candidate academic details
        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        // Read candidate skills
        int skillCount = scanner.nextInt();
        String[] skills = new String[skillCount];

        for (int i = 0; i < skillCount; i++) {
            skills[i] = scanner.next();
        }

        // Create Candidate object
        Candidate candidate = new Candidate(
            name,
            percentage,
            backlogs,
            graduationYear,
            skills
        );

        // Read number of jobs and their eligibility criteria
        int jobCount = scanner.nextInt();
        Job[] jobs = new Job[jobCount];

        for (int i = 0; i < jobCount; i++) {
            String company = scanner.next();
            String role = scanner.next();
            double minimumPercentage = scanner.nextDouble();
            int maximumBacklogs = scanner.nextInt();
            int requiredGraduationYear = scanner.nextInt();

            // Read required skills for the current job
            int requiredSkillCount = scanner.nextInt();
            String[] requiredSkills = new String[requiredSkillCount];

            for (int j = 0; j < requiredSkillCount; j++) {
                requiredSkills[j] = scanner.next();
            }

            // Create Job object and store it in the array
            jobs[i] = new Job(
                company,
                role,
                minimumPercentage,
                maximumBacklogs,
                requiredGraduationYear,
                requiredSkills
            );
        }

        // Display all available jobs
        System.out.println();
        System.out.println("AVAILABLE JOBS");

        for (int i = 0; i < jobs.length; i++) {
            System.out.println((i + 1) + ". " + jobs[i].getCompany() + " - " + jobs[i].getRole());
        }
        // Read user's job selection
        int selectedJobNumber = scanner.nextInt();
        // Select the corresponding job from the array
        Job selectedJob = jobs[selectedJobNumber - 1];

        EligibilityChecker checker = new EligibilityChecker();

        // Print result header and summary details
        System.out.println("================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("================================");

        System.out.println();
        System.out.println("Candidate : " + candidate.getName());
        System.out.println("Company   : " + selectedJob.getCompany());
        System.out.println("Role      : " + selectedJob.getRole());
        System.out.println();

        // Evaluate candidate against the selected job
        boolean eligible = checker.evaluate(candidate, selectedJob);

        System.out.println();

        // Print final eligibility decision
        if (eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        System.out.println("================================");

        scanner.close();
    }
}