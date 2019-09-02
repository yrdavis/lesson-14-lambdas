package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
 * 1. Make the JobCandidate class implement Comparable.  
 * 2. Add a JobCandadate instance that represents yourself, and use compareTo() to see who should be given the job.
 * 
 */

import java.util.List;

public class JobCandidate {

	private List<String> personalityTraits;
	private int hoursSpentCoding;
	private String teacherName;
	private int salaryRequired;
	private String name;

	public JobCandidate(String name, List<String> personalityTraits, int hoursSpentCoding, String teacherName, int salaryRequired) {
		super();
		this.name = name;
		this.personalityTraits = personalityTraits;
		this.hoursSpentCoding = hoursSpentCoding;
		this.teacherName = teacherName;
		this.salaryRequired = salaryRequired;
	}

	public String toString() {
		return this.name + ": " + this.hoursSpentCoding + " hours";
	}

	public static void main(String[] args) {
		JobCandidate june = new JobCandidate("June", Arrays.asList(new String[]{"adaptable", "scatty", "curious"}), 6500, "Vinny Wade", 1200000);
		JobCandidate jelena = new JobCandidate("Jelena", Arrays.asList(new String[]{"fast-learner", "goal-oriented", "persistant"}), 60, "June Clark", 100000);
		JobCandidate alex = new JobCandidate("Alex", Arrays.asList(new String[]{"adaptable", "consistent", "friendly"}), 130, "June Clark", 30000);
		JobCandidate ivana = new JobCandidate("Ivana", Arrays.asList(new String[]{"flexible", "responsible"}), 200, "June Clarke", 1000000);
		JobCandidate marina = new JobCandidate("Marina", Arrays.asList(new String[]{"responsible", "friendly", "team-mate"}), 250, "June Clarke", 1000000);
		JobCandidate marko = new JobCandidate("Marko", Arrays.asList(new String[]{"loyal", "friendly", "hardworker"}), 40, "Andrija and June", 2000);
		JobCandidate milan = new JobCandidate("Milan", Arrays.asList(new String[]{"adaptable", "scatty", "curious"}), june.hoursSpentCoding / 3, "June Clark",
				june.salaryRequired * 2);
		JobCandidate vlada = new JobCandidate("Vladimir", Arrays.asList(new String[]{"open", "fair", "humorous"}), 700, "Joon Spoon", 1200);

		List<JobCandidate> candidates = new ArrayList<JobCandidate>();
		candidates.add(june);
		candidates.add(jelena);
		candidates.add(alex);
		candidates.add(ivana);
		candidates.add(marina);
		candidates.add(marko);
		candidates.add(milan);
		candidates.add(vlada);

		/* Sort the candidates by coding experience. */

		// 3. Use a lambda expression
		Collections.sort(candidates, (jc1, jc2) -> jc2.hoursSpentCoding - jc1.hoursSpentCoding);

		// 2. Use an anonymous inner class
		// Collections.sort(candidates, new Comparator<JobCandidate>() {
		//
		// @Override
		// public int compare(JobCandidate jc1, JobCandidate jc2) {
		// return jc2.hoursSpentCoding - jc1.hoursSpentCoding;
		// }
		// });

		System.out.println(candidates);
	}

	// 1. Have this class implement Comparable<JobCandidate>
	// @Override
	// public int compareTo(JobCandidate o) {
	// return o.hoursSpentCoding - this.hoursSpentCoding;
	// }

}
