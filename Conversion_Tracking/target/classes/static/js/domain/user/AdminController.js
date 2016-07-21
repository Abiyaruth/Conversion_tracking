angular
.module('app')
.controller('AdminController', ['AdminService','$routeParams', '$location', '$scope','$http', function(AdminService, $routeParams, $location, $scope,$http)
{
	
	var ctl = this
	
// Redirects to the login page
	this.navTo = function(url) {
		if ($location.path() == url) {
			$route.reload()
		} else {
			$location.path(url);
		}
	}
	
//Display baseUrl
	   ctl.baseUrl=$location.path();
	   
//Adding NewUrl
//	   var ctrl = this;
//		
//		this.createUrl = function() {
//			var url = {
//					"baseUrl": ctrl.baseUrl,
//					"number": +ctrl.number,
//					"description": ctrl.description,
//					"label" :ctrl.label,
//			}
//			console.dir(url)
//			UrlService.submitUrl(url)
//		}
//	   
	   
//	   $scope.newUrl=function() {
//		   var url=$scope.url;
//		   url.baseUrl='/login'
//		   url.extensionUrl=appendNum(url.baseUrl)
//		   $http.post("/url/find",data).then(data)=> {
//			  $scope.hello=data;
//	   }
//	   console.log("reached")
////Appending number to baseUrl
//	   
//	   var appendNum=function(baseUrl){
//		   let max = 0
//			let extensions = $scope.URLs.filter((x) => x.baseUrl === baseUrl).map((x) => x.appendNum)
//			do {
//				max++
//			} while(extensions.indexOf(max) != -1)
//			return max
//	   }
	   
	
////Adding new url
//	   $scope.newurl = function () {
//			let url = $scope.url
//			url.baseURL = '/login'
//			url.extensionURL = appendNum(url.baseURL)
//			
//	
////Appending number to baseUrl
//	   console.log("admin check");
//	   const appendNum =function(baseUrl){
//		   var num=0;
//		   $scope.url.filter(n)
//		   if(n.baseUrl===baseUrl){
//		   var append=baseUrl+num;
//		   num++;
//		   }else {
//			   return num;
//		   }
////		  
//		   console.log("append");
//		   var append=$scope.Url.filter((n)=>n.baseUrl===baseUrl).map((n=>n.append)
		   	
}]);