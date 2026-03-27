package com.example.demo.cv;

import java.util.List;

public record CvProfile(
	String fullName,
	String title,
	String summary,
	String objective,
	List<ContactLink> contacts,
	List<Snapshot> snapshots,
	List<String> focusTags,
	Education education,
	List<String> strengths,
	List<ProjectItem> projects,
	List<SkillGroup> skillGroups,
	List<CertificateItem> certificates,
	String foreignLanguage,
	String achievement,
	String portfolioNote,
	String pdfPath
) {

	public record ContactLink(String value, String href) {
	}

	public record Snapshot(String label, String value) {
	}

	public record Education(
		String school,
		String period,
		String major,
		String gpa,
		String expectedGraduation
	) {
	}

	public record ProjectItem(
		String name,
		String period,
		String stack,
		List<String> highlights
	) {
	}

	public record SkillGroup(String name, String value) {
	}

	public record CertificateItem(String name, String year) {
	}
}
