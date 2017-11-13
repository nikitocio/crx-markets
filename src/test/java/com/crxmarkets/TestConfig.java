package com.crxmarkets;

import com.crxmarkets.service.VolumeDetectorService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author nivanov, <a href="mailto:Nikita.Ivanov@returnonintelligence.com">Ivanov Nikita</a>
 * @since 12-Nov-17
 */

@Configuration
public class TestConfig {

	@Bean
	public VolumeDetectorService volumeDetectorService() {
		return Mockito.mock(VolumeDetectorService.class);
	}

}
