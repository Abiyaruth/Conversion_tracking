angular
  .module('app')
  .controller('RegisterController',['RegisterService','$location','$routeParams', 'LoginService',	function(RegisterService, $location, $routeParams, LoginService) {
	var ctrl = this;
	ctrl.id = +$routeParams.id
	
	RegisterService.getInfo($routeParams.id)
	.then(function(result){
		ctrl.location = result.data;
	})
	console.log("in the register")
	
// Register form control
	
	this.signup = function() {
	  var user = {
	  "username" : ctrl.username,
	  "password" : ctrl.password,
	  "role": ctrl.role,
	  }
	  console.dir(user)
	  
	  RegisterService.sendRegister(user)
	  .then(function(result) {
		if ($routeParams.id > 0) {
			var date = new Date()
			var d = date.getDate()
			var m = date.getMonth()+1
			var y = date.getFullYear()
			date = m + "" + d + "" + y
			RegisterService.addRegisterHit(date, ctrl.id)
			.then(function(result) {
				return null;
			})
			RegisterService.addConvHit(date, ctrl.id)
			.then(function(result) {
				return null;
			})
		}
		ctrl.user = result.data
		if (ctrl.user.code === 'OK') {
			$location.path('/user')
		  }
		else {
		    alert('Signup Failed')
		  }
	  })
	}
}])