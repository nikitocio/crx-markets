package com.crxmarkets.rest;

import com.crxmarkets.service.VolumeDetectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author nivanov, <a href="mailto:Nikita.Ivanov@returnonintelligence.com">Ivanov Nikita</a>
 * @since 12-Nov-17
 */
@Controller
@RequestMapping(value = "/volume")
public class VolumeDetectorRestController {

	@Autowired
	private VolumeDetectorService volumeDetectorService;

	public void setVolumeDetectorService(VolumeDetectorService volumeDetectorService) {
		this.volumeDetectorService = volumeDetectorService;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public int getVolume(@RequestParam("inputData") int[] inputData){
		int res = volumeDetectorService.getVolume(inputData);
		return res;
	}
}
