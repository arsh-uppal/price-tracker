/**
 * The main controller 
 */
app.controller('TrackController',function($scope, $rootScope, $http, $log, TrackFactoryService){
	
	$scope.sumbitTrackUrl = function(){
		var trackUrl = $scope.trackUrl;
		TrackFactoryService.processTrackUrl(trackUrl).then(
		function(data){
			$log.info(data);
		}, function(response){
			$log.error("Error while calling service	!!");
		});
	}
});