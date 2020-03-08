/**
 * @author arshdeep 
 */
var app = angular.module('myApp',["ngRoute"]);

app.config(function($routeProvider, $locationProvider){
	$locationProvider.hashPrefix("");
	$routeProvider
		.when('/track', {
			templateUrl: 'partials/track.html',
			controller: 'TrackController'
		})
		.otherwise({
			redirectTo : '/track'
		})
});