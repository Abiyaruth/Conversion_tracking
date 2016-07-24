angular.module('app').service('GraphService', ['$http', function($http) {
	
	var url = 'number/';
	var urlLoc = 'location/';
	
	this.getAnonHits = function(id) { return $http.get(url + 'getViewsHits/' + id) };
	this.getConvHits = function(id) { return $http.get(url + 'getConvertedHits/' + id) };
	this.getAnonHitsTotal = function(id) { return $http.get(url + 'getViewsHits/total/' + id) };
	this.getConvHitsTotal = function(id) { return $http.get(url + 'getConvertedHits/total/' + id) };
	this.getAnonHitsWeek = function(id) { return $http.get(url + 'getViewsHits/week/' + id) };
	this.getConvHitsWeek = function(id) { return $http.get(url + 'getConvertedHits/week/' + id) };
	this.getInfo = function(id) { return $http.get(urlLoc + 'getInfo' + '/' + id) };

}])