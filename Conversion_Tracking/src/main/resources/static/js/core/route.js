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
    	when('/hits', {
            templateUrl: baseRoute + 'user/hitsTemplate.html',
            controller: 'HitsController',
            controllerAs: 'hitsController',
            resolve: {
                allUrls: function(HitsService){
            		 return HitsService.getAllUrls();
            	  }
              }
          }).
        when('/user', {
        	templateUrl: baseRoute + 'user/userTemplate.html',
        	controller: 'UserController',
        	controllerAs: 'userController'
        }).
        when('/graph/:id', {
        	templateUrl: baseRoute + 'user/graphTemplate.html',
        	controller: 'GraphController',
        	controllerAs: 'graphController',
        	resolve: {
        		anonHits: function(GraphService, $route) {
          		     return GraphService.getAnonHits($route.current.params.id);
          	     },
          	   convHits: function(GraphService, $route) {
          		   return GraphService.getConvHits($route.current.params.id);
          	   },
          	 anonHitsWeek: function(GraphService, $route) {
      		     return GraphService.getAnonHitsWeek($route.current.params.id);
      	     },
      	   convHitsWeek: function(GraphService, $route) {
      		   return GraphService.getConvHitsWeek($route.current.params.id);
      	   },
      	 anonHitsTotal: function(GraphService, $route) {
  		     return GraphService.getAnonHitsTotal($route.current.params.id);
  	     },
  	   convHitsTotal: function(GraphService, $route) {
  		   return GraphService.getConvHitsTotal($route.current.params.id);
  	   },
          	   location: function(GraphService, $route) {
          		   return GraphService.getInfo($route.current.params.id)
          	   }
        	}
        }).
        otherwise('/home');
    }
  ])
  

