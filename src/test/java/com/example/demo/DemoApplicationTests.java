package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.cv.CvProfileService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private CvProfileService cvProfileService;

	@Test
	void cvProfileIsAvailable() {
		assertThat(cvProfileService.getProfile().fullName()).isEqualTo("Phan Thi Phuong Dung");
	}

}
