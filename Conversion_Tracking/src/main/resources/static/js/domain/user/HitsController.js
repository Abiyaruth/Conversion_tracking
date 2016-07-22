angular.module('app').controller('HitsController', ['HitsService', 'allUrls', '$routeParams', 'LoginService', '$location', '$scope', function(HitsService, allUrls, $routeParams, LoginService, $location, $scope)
{
	const ctrl = this
	
	ctrl.urls = allUrls.data
	ctrl.hits = []
	ctrl.month = []
	ctrl.all = []
	
	this.current= 'total';
	this.available = ['total', 'day', 'week', 'month'];
	
	ctrl.locations = [];
	
	var date = new Date()
	var d = date.getDate()
	var m = date.getMonth()+1
	var y = date.getFullYear()
	date = m + "" + d + "" + y
	
	allUrls.data.map(function(url){
		var locationHitData = { 
				'extensionURL': url.extensionURL, 
				'location' : url.label
				};
		ctrl.locations.push(locationHitData);
		
		HitsService.getHitsWeek(url.extensionURL).then((result) => {
			locationHitData.week = result.data
		}).then(() => {
			HitsService.getHitsMonth(url.extensionURL).then((result) => {
				locationHitData.month = result.data;
			}).then(() => {
				HitsService.getHitsTotal(url.extensionURL).then((result) => {
					locationHitData.total = result.data;
				}).then(() => {
					HitsService.getHitsDaily(url.extensionURL,date).then((result) => {
					locationHitData.daily = result.data;
				})
				})
			})
		})
	})

}])