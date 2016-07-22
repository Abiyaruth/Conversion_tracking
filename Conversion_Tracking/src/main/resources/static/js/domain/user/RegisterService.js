angular.module('app').service('RegisterService', ['$http', function($http) {
	
	var url = 'user/';
	var url2 = 'number/';
	var urlLoc = 'location/';
	
	this.sendRegister = function(user) { return $http.post(url + 'create', user) };
	this.addConvHit = function(date, id) { return $http.get(url2 + 'addHit' + '/' + date + '/' + id + '/' + 'convert') };
	this.addRegisterHit = function(date, location) { return $http.get(url2 + 'addHit' + '/' + date + '/' + location + '/' + 'signup' ) };
	this.getInfo = function(id) { return $http.get(urlLoc + 'conversion' + '/' + id) };
}])