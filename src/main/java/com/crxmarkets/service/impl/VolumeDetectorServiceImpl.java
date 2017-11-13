package com.crxmarkets.service.impl;

import com.crxmarkets.service.VolumeDetectorService;
import org.springframework.stereotype.Service;

/**
 * @author nivanov, <a href="mailto:Nikita.Ivanov@returnonintelligence.com">Ivanov Nikita</a>
 * @since 12-Nov-17
 */

@Service("volumeDetectorService")
public class VolumeDetectorServiceImpl implements VolumeDetectorService{


	/**
	 * Calculate volume based on input array
	 *
	 * @param arrayData
	 * @return int volume
	 */
	@Override
	public int getVolume(int[] arrayData) {
		if (arrayData.length <=2) {
			return 0;
		}

		int result = 0;

		int leftIndex = 0;
		int leftMax = arrayData[leftIndex];

		int rightIndex = arrayData.length - 1;
		int rightMax = arrayData[rightIndex];

		while (leftIndex < rightIndex) {
			if (leftMax < rightMax) {
				leftIndex++;
				if (arrayData[leftIndex] >= leftMax) {
					leftMax = arrayData[leftIndex];
				} else {
					result += Math.min(leftMax, rightMax) - arrayData[leftIndex];
				}
			} else {
				rightIndex--;
				if (arrayData[rightIndex] >= rightMax) {
					rightMax = arrayData[rightIndex];
				} else {
					result += Math.min(leftMax, rightMax) - arrayData[rightIndex];
				}
			}
		}

		return result;
	}

}
