define(['angular'], function (angular) {
    'use strict';

    return function MainController($scope, MainService) {

        var ctrl = this;

        $scope.arrayData = "";
        $scope.getVolume = function(){
            MainService.getVolume($scope.arrayData).then(function(response){
                $scope.result = response.data;
            }, function errorCallback(response) {
                $scope.result = response.statusText + ", please check the value of an input field";
            });
        };

    };
});
