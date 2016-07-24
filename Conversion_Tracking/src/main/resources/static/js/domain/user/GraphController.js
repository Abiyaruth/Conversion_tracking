angular.module('app').controller('GraphController', ['GraphService', 'anonHits', 'convHits', 'location', 'anonHitsWeek', 'convHitsWeek', 'anonHitsTotal', 'convHitsTotal', '$location',  function(GraphService, anonHits, convHits, location, anonHitsWeek, convHitsWeek, anonHitsTotal, convHitsTotal, $location)
{
	const ctrl = this
	
	ctrl.anon = anonHits.data
	ctrl.conv = convHits.data
	ctrl.name = location.data.locationName
	
	ctrl.anonweek = anonHitsWeek.data
	ctrl.convweek = convHitsWeek.data
	ctrl.anontotal = anonHitsTotal.data
	ctrl.convtotal = convHitsTotal.data
	ctrl.goBack = function () {
		$location.path('/stats')
	}
	function array(int) {
		let returnArr = []
		for (var x = 0; x < int; x++) {
			returnArr.push(x)
		}
		return returnArr
	}
	
	var trace1 = {
		x: array(30),
		y: ctrl.anon,
		name: 'Anonymous Hits',
	    type: 'scatter'
	}
	
	var trace2 = {
		x: array(30),
		y: ctrl.conv,
		name: 'Converted Hits',
	    type: 'scatter'
	}
	
	var trace3 = {
			x: array(7),
			y: ctrl.anonweek,
			name: 'Anonymous Hits',
		    type: 'scatter'
		}
		
		var trace4 = {
			x: array(7),
			y: ctrl.convweek,
			name: 'Converted Hits',
		    type: 'scatter'
		}
	
	var trace5 = {
			x: array(50),
			y: ctrl.anontotal,
			name: 'Anonymous Hits',
		    type: 'scatter'
		}
		
		var trace6 = {
			x: array(50),
			y: ctrl.convtotal,
			name: 'Converted Hits',
		    type: 'scatter'
		}
	
	var month = [trace1, trace2];
	var week = [trace3, trace4];
	var total = [trace5, trace6];
	var layout = {
		xaxis: {
			title: 'Days'
		},
		yaxis: {
			title: 'Hits'
		},
		margin: { t: 0 }
	};
	
	Plotly.newPlot('week', week, layout);
	Plotly.newPlot('month', month, layout);
	Plotly.newPlot('total', total, layout);
	

}])