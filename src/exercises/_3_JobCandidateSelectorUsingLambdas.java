package exercises;

import java.util.Collections;

/*
 * @author Yvonne Davis
 * @version 1
 * Sort and filter job candidates based on criteria
 */
public class _3_JobCandidateSelectorUsingLambdas {
	public static void main(String[] args) {

		// 1. Sort the candidates by salary requirements, low to high.
		Collections.sort(JobCandidate.jobCandidates, (jc1, jc2) -> jc1.getSalaryRequired() - jc2.getSalaryRequired());
		System.out.println(JobCandidate.jobCandidates);

		// 2. Filter out any candidates that have not been taught by me (June)
		// Hint: see the removeIf() method in the Collections class
		JobCandidate.jobCandidates.removeIf(s -> !s.getTeacherName().contains("June"));

		// List<JobCandidate> juneStudents = JobCandidate.jobCandidates.stream()
		// .filter(herStudents ->
		// herStudents.getTeacherName().contains("June")).collect(Collectors.toList());

		System.out.println(JobCandidate.jobCandidates);
	}
}
