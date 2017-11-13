requirejs.config({
	waitSeconds: 300,
	paths: {
		'angular': 'common/angularjs/1.5.7/angular.min',
		'angular-resource': 'common/angularjs/1.5.7/angular-resource.min',
		'angular-sanitize': 'common/angularjs/1.5.7/angular-sanitize.min',
		'angular-animate': 'common/angularjs/1.5.7/angular-animate.min',
		'angular-route': 'common/angularjs/1.5.7/angular-route.min',
		'angular-messages': 'common/angularjs/1.5.7/angular-messages',
		'angular-cookies': 'common/angularjs/1.5.7/angular-cookies.min',
		'text': 'common/requirejs/plugins/text/2.0.15/text'
	},
	shim: {
		'angular' : {
			'exports' : 'angular'
		},
		'angular-resource': ['angular'],
		'angular-sanitize': ['angular'],
		'angular-animate': ['angular'],
		'angular-cookies': ['angular'],
		'angular-route': ['angular'],
		'angular-messages': ['angular']
	}
});

requirejs(['app'], function() {
	angular.element(document).ready(function() {
    	angular.bootstrap(document, ['VolumeDetectorApp']);
	});
});