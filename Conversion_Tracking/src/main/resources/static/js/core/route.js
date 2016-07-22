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
      	when('/login', {
            templateUrl: baseRoute + 'user/loginTemplate.html',
            controller: 'LoginController',
            controllerAs: 'loginController'
          }).
      	when('/admin', {
          templateUrl: baseRoute + 'user/adminTemplate.html',
          controller: 'AdminController',
          controllerAs: 'adminController',
          resolve: {
//              allURLs: function(AdminService){
//	                  return AdminService.getURLs();
//	          }
        	  //TODO
          }
        }).
        when('/register',{
        	templateUrl:baseRoute+'user/registerTemplate.html',
        	controller :'RegisterController',
        	controllerAs :'registerController'
        }).
        when('/hits',{
        	templateUrl :baseRoute +'user/hitsTemplate.html',
        	controller : 'HitsController',
        	controllerAs:'hitsController',
        		 resolve: {
                     allUrls: function(HitsService){
                 		 return HitsService.getAllUrls();
                 	  },
        		 }
        }).
        when('/user', {
        	templateUrl: baseRoute + 'user/userTemplate.html',
        	controller: 'UserController',
        	controllerAs: 'userController'
        }).
        otherwise('/home');
    }
  ])
  

