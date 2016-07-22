angular.module('app').service('HitsService', ['$http', function($http) {
	
	var url = 'location/';
	
	var url2 = 'getAllHits/';
	
	this.getAllUrls = function() { return $http.get(url + 'getLoc') };
	this.getHitsWeek = function(id) { return $http.get(url2  + 'null' + '/' + id + '/week') };
	this.getHitsMonth = function(id) { return $http.get(url2 + 'null' + '/' + id + '/month') };
	this.getHitsTotal = function(id) { return $http.get(url2 + 'null' + '/' + id + '/total') };
	this.getHitsDaily = function(id, date) { return $http.get(url2 + date + '/' + id + '/daily') };
	
}])