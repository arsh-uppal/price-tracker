/**
 * 
 */
app.factory('TrackFactoryService', function($http, $log) {

	var myFactory = {};

	myFactory.processTrackUrl = function(trackUrl) {
		$log.info("Url is:"+trackUrl);
		var trackUrlObj = [ {
			"trackUrlMain" : trackUrl
			} 
		];
		return $http.post("myrest.do", trackUrlObj);
	}

	return myFactory;
});