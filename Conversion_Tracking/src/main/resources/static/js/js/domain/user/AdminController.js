angular
.module('app')
.controller('AdminController', ['AdminService','LocationService','$routeParams', '$location', '$scope', 'baseLogin', function(AdminService,LocationService, $routeParams, $location, $scope, baseLogin)
{
	
	const ctl = this
	
// Redirects to the login page
	this.navTo = function(url) {
		if ($location.path() == url) {
			$route.reload()
		} else {
			$location.path(url);
		}
	}
	
////Display baseUrl
//	this.baseUrl=function() {
//	 $location.path();	
//	}
//	
	
	
//Appending number to baseloginUrl
	this.AppendNum=function() {
		 var x=0;
		var num=num.append('x++');
	}
	
	
	
	
	
	
//	ctl.admin = LoginService.loginStatus().obj
//	ctl.alocation = function(){
//		if($location){
//			ctl.alocation=$location.path('/login');
//		}
//	}
	
//	$scope.alocation="/Conversion_Tracking/#/login";
	
	if ($location) {
		ctl.alocation = $location.path();
//		ctl.alocation = baseLogin
	}
//	
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