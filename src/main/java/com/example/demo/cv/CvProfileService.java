package com.example.demo.cv;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CvProfileService {

	public CvProfile getProfile() {
		return new CvProfile(
			"Phan Thi Phuong Dung",
			"Tester Intern",
			"""
			Final-year Information Technology student with a strong interest in software testing and quality assurance.
			Familiar with manual testing, test case design, bug reporting, and API testing with Postman.
			""",
			"""
			Seeking a QA Intern position to apply analytical skills, build more hands-on experience,
			and contribute to software quality improvement in a real product environment.
			""",
			List.of(
				new CvProfile.ContactLink("0766 776 759", "tel:0766776759"),
				new CvProfile.ContactLink("phuongdungphan1207@gmail.com", "mailto:phuongdungphan1207@gmail.com"),
				new CvProfile.ContactLink("github.com/PhuongDung1207", "https://github.com/PhuongDung1207"),
				new CvProfile.ContactLink("Ho Chi Minh City", null)
			),
			List.of(
				new CvProfile.Snapshot("GPA", "3.82 / 4.0"),
				new CvProfile.Snapshot("Graduation", "Expected 2026"),
				new CvProfile.Snapshot("Projects", "2 QA-focused builds"),
				new CvProfile.Snapshot("English", "B1 + IELTS 6.5 mock")
			),
			List.of("Manual Testing", "API Testing", "Cypress", "Jest", "Postman", "Docker"),
			new CvProfile.Education(
				"Ho Chi Minh City University of Technology",
				"2022 - Present",
				"Information Technology",
				"3.82 / 4.0",
				"2026"
			),
			List.of(
				"Clear bug reporting with reproduction steps, expected results, and actual results.",
				"Comfortable checking both valid and invalid input paths to verify reliability and usability.",
				"Hands-on experience with API testing, automated flows, and regression support.",
				"Strong attention to detail, analytical thinking, teamwork, and communication."
			),
			List.of(
				new CvProfile.ProjectItem(
					"Hospital Appointment Booking Website",
					"04/2025 - 12/2025",
					"Academic Project | Node.js, ReactJS, PostgreSQL",
					List.of(
						"Designed and executed functional test scenarios for patient registration, login, doctor search, appointment booking, rescheduling, and cancellation.",
						"Performed API testing using Postman to validate request-response data, status codes, and backend behavior for appointment-related functions.",
						"Automated end-to-end core booking flows with Cypress and used Jest to support selected application logic and component checks.",
						"Identified and documented defects, verified valid and invalid input conditions, and collaborated with teammates to retest fixes after updates."
					)
				),
				new CvProfile.ProjectItem(
					"Warehouse Management System",
					"01/2026 - 03/2026",
					"Academic Project | Java Spring Boot, PostgreSQL",
					List.of(
						"Analyzed requirements and created test scenarios and test cases for product, category, and inventory management features.",
						"Conducted functional testing to verify stock import-export processes and product information handling.",
						"Performed API testing for inventory-related operations and checked response accuracy.",
						"Documented bugs related to validation, business logic, and UI behavior, then supported regression testing after updates."
					)
				)
			),
			List.of(
				new CvProfile.SkillGroup("Testing", "Functional Testing, API Testing, Manual Testing"),
				new CvProfile.SkillGroup("Automation", "Cypress, Jest"),
				new CvProfile.SkillGroup("Tools", "Postman, GitHub, Jira, Trello, Docker"),
				new CvProfile.SkillGroup("Programming", "Java, JavaScript")
			),
			List.of(
				new CvProfile.CertificateItem("English B1 Certificate", "2025"),
				new CvProfile.CertificateItem("Javascript Essential 1 & 2", "2025"),
				new CvProfile.CertificateItem("Networking Basics", "2025")
			),
			"English",
			"Achieved 6.5 in an IELTS mock test at WESET.",
			"This website is rendered by Spring Boot and its content is based on the provided CV PDF.",
			"/assets/PhanThiPhuongDung_InternTester_CV.pdf"
		);
	}
}
