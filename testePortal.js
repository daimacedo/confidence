function testePortal(){

var reporter = require('cucumber-html-reporter');
 
var options = {
        theme: 'bootstrap',
        jsonFile: '/home/daiane.macedo/workspace2/portal/src/test/java/reports/cucumber.json',
        output: '/home/daiane.macedo/workspace2/cucumber/src/test/java/reports/cucumber.html',
        reportSuiteAsScenarios: true,
        launchReport: true,
        metadata: {
            "Url":"confidencecambio.com.br",
            "Test Environment": "STAGING",
            "Browser": "Firefox  54.0.2840.98",
            "Platform": "Ubuntu 16",

        }
    };
 
    reporter.generate(options);  
}

testePortal();