angular.module('app').service('AdminService', ['$http', function($http) {
	var url='/url'
	this.getURLs = function() { 
		return $http.get(url + '/getAll') 
		};
	this.submitURL = function(Url) { 
		
		return $http.post(url + '/Createurl', Url) 
		
		};
	
}])