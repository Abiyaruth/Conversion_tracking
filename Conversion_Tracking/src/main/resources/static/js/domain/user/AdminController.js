angular
.module('app')
.controller('AdminController', ['AdminService','$routeParams', '$location', '$scope','$http','$filter', function(AdminService,$routeParams, $location, $scope,$http,$filter)
{
	console.log("adminController")

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
	   
//Getting Url
	   
		  ctl.getURLs=function(){
			  console.log("Im in UR getURLs, iterating over your RESULTZ")
			AdminService.getURLs()
			.then(function(result){
				ctl.allURLs=result.data
				console.log("allurls")
				console.dir(ctl.allURLs)
			})
		  }	   
		  ctl.getURLs()
		  
//Adding NewUrl
		  
	  ctl.new_url=function() {
		  console.log("Im in UR new_urls, messin wit ur new URL to store")
		  var Url = {
				  "baseURL" : '/login',
				  "extensionURL" :ctl.extensionURL,
				  "description" :ctl.description,
				  "label" :ctl.label,

				  
		  }
		
		  console.dir(Url)
//Storing NewUrl in database
		  
		  AdminService.submitURL(Url)
		  .then((response)=> {
			  if(response.status==200){
				  ctl.allURLs.push(Url)
			  }else{
				  console.log("failed")
			  }
		  })
	  }
		  
// Clears the fields
		  
		  $scope.clearSearch = function() {
			    ctl.description = null
			    ctl.label = null
			    ctl.extensionURL=null
			}
}]);