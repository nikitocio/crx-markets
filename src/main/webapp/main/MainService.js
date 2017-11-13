define(function () {
    return function ($http, urls) {
        this.getVolume = function(arrayDataString) {

            var config= {
                params: {inputData: arrayDataString.split(',')}
            }

            return $http.get(urls.findVolume, config);
        };
    };
});
