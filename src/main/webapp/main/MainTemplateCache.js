define([
        'angular',
        'text!main/MainTemplate.html'
    ],
    function (angular,
              MainTemplateHtml
    ) {
        'use strict';

        angular.module("main.MainTemplateCache", []).run(["$templateCache", function ($templateCache) {
            $templateCache.put('main/MainTemplate.html', MainTemplateHtml);
        }]);
    });

