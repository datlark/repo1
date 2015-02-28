'use strict';

// Declare app level module which depends on filters, and services
angular.module('swan', ['swan.filters', 'swan.services', 'swan.directives', 'swan.controllers']).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/view1', {templateUrl: 'partials/partial1.html', controller: 'MyCtrl1'});
        $routeProvider.otherwise({redirectTo: '/view1'});
    }]);


angular.module('F1FeederApp', [
                               'F1FeederApp.controllers',
                               'F1FeederApp.services'
                             ]);