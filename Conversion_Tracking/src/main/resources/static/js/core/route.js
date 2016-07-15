angular.
  module('app').
  config(['$routeProvider', 'baseRoute', 'homePage',
    function config($routeProvider, baseRoute, homePage) {

      $routeProvider.
      	when('/home', {
          
          templateUrl: homePage,
          controller: 'HomeController',
          controllerAs: 'homeController'
          
        }).
        when('/Location',{
        	   templateUrl: baseRoute + 'location/locationTemplate.html',
          controller: 'LocationController',
          controllerAs: 'LocationController',
          resolve: {
              allUsers: function(LocationService){
	                  return LocationService.getAllUsers();
	          }
          }
        
        }).
       otherwise('/home');
  }
  ]);