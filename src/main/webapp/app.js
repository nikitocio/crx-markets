define([
	'angular',

    //controllers
	'main/MainController',

    //services
    'main/MainService',

    //constants
    'UrlsConstants',

 	'main/MainTemplateCache',
	'angular-resource',
	'angular-sanitize',
    'angular-route',
	'angular-animate',
	'angular-cookies',
    'angular-messages'
], function(
	angular,

    //controllers
    MainController,

    //services
    MainService,

    //constants
    UrlsConstants
) {
	'use strict';

	angular.module('VolumeDetectorApp', [
        'ngResource', 'ngCookies', 'ngSanitize', 'ngRoute', 'ngAnimate', 'ngMessages', 'main.MainTemplateCache'
	])
        .controller('MainController', ['$scope', 'MainService',  MainController])

        .service('MainService', ['$http', 'UrlsConstants', MainService])

        .constant('UrlsConstants', UrlsConstants)

        .config(['$httpProvider', '$routeProvider', function ($httpProvider, $routeProvider) {
			$routeProvider
                .when('/', {
                    templateUrl: 'main/MainTemplate.html'
                })
                .otherwise({
                    redirectTo: '/'
                });
        }]);
});