package com.crxmarkets.controller;

import com.crxmarkets.TestConfig;
import com.crxmarkets.rest.VolumeDetectorRestController;
import com.crxmarkets.service.VolumeDetectorService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.eq;

/**
 * @author nivanov, <a href="mailto:Nikita.Ivanov@returnonintelligence.com">Ivanov Nikita</a>
 * @since 12-Nov-17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfig.class })
public class VolumeDetectorControllerTest {

	@Autowired
	private VolumeDetectorService volumeDetectorService;

	private VolumeDetectorRestController volumeDetectorRestController;

	@Before
	public void setUp(){
		volumeDetectorRestController = new VolumeDetectorRestController();
		volumeDetectorRestController.setVolumeDetectorService(volumeDetectorService);
	}

	@Test
	public void checkOneCondition() {

		int[] intArray = {4, 1, 1, 0, 2, 3};

		when(volumeDetectorService.getVolume(eq(intArray))).thenReturn(8);

		int res = volumeDetectorRestController.getVolume(intArray);
		Assert.isTrue(res == 8);
	}

	@Test
	public void checkEmptyCondition() {

		int[] intArray = {};

		when(volumeDetectorService.getVolume(eq(intArray))).thenReturn(0);

		int res = volumeDetectorRestController.getVolume(intArray);
		Assert.isTrue(res == 0);
	}
}
