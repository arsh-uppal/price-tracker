package com.ars.sra.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ars.sra.model.TrackUrlModel;
import com.ars.sra.service.RestTrackService;

@RestController
public class RestTrackController {
	static Logger log = Logger.getLogger(RestTrackController.class.getName());
	@Autowired
	TrackUrlModel trackUrlModel;
	
	@PostMapping("/myrest")
	public Map<String, Object> etc(@RequestBody TrackUrlModel[] trackUrlModel) throws IOException {
		log.info(trackUrlModel[0].getTrackUrlMain());
		Map <String, Object> map = new HashMap<String, Object>();
		map.put("Data",new RestTrackService().processProductUrl(trackUrlModel[0].getTrackUrlMain()));
		return map;
	}
}
