//angular.module('app').controller('AdminController', ['AdminService','$scope','$location','$routeParams', function AdminController(AdminService,$scope,$location,$routeParams) {
//	$scope.redirect = function(url, refresh) {
//	    if(refresh || $scope.$$phase) {
//	        $window.location.href = url;
//	    } else {
//	        $location.path(url);
//	        $scope.$apply();
//	    }
//	}
//	
////	this.goLogin = function() {
////        $location.path ('/login');
////	}
//        // var ctrl=this;
////	   this.goToLogin =function(url) {
////		   if ($location.path() == url) {
////				$route.reload()
////			} else {
////				$location.path(url);
////			}
////		}
////		
////		if ($location) {
////			ctl.alocation = $location.path()
////		}
//	    } ]);   
angular.module('app').controller('AdminController', ['AdminService', '$routeParams', 'LoginService', '$location', '$scope', 'baseLogin', function(AdminService, $routeParams, LoginService, $location, $scope, baseLogin)
{
	const ctl = this
	
	this.navTo = function(url) {
		if ($location.path() == url) {
			$route.reload()
		} else {
			$location.path(url);
		}
	}
	
	ctl.admin = LoginService.loginStatus().obj
	
	if ($location) {
//		ctl.alocation = $location.path()
		ctl.alocation = baseLogin
	}
	
//	this.createLogin = function(number, label, description) {
//		return {
//			number,
//			label,
//			description
//		}
//	}
//	var x = 0 //change to number of urls + 1 when you implement it
//	this.addUrl = function() {
//		var template_url = '<div class="col-sm-4" id="url' + x + '"> <h1>' + baseLogin + '/' + x + ' </h1></div>';
//		var template_label = '<div class="col-sm-4" id="lab' + x + '"><h1>label</h1></div>'
//		var template_descr = '<div class="col-sm-4" id="des' + x + '"><h1>desc</h1></div>'
//		angular.element(document.getElementsByName('urls')).append(template_url)
//		angular.element(document.getElementsByName('urls')).append(template_label)
//		angular.element(document.getElementsByName('urls')).append(template_descr)
//		x++;
//	}


}])