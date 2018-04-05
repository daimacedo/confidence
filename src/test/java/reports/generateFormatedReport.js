function teste(){

var reporter = require('cucumber-html-reporter');
 
var options = {
        theme: 'bootstrap',
        jsonFile: '/home/daiane.macedo/workspace2/portal/src/test/java/reports/cucumber.json',
        output: '/home/daiane.macedo/workspace2/portal/src/test/java/reports/report.html',
        reportSuiteAsScenarios: true,
        launchReport: true,
        metadata: {
            "System":"Portal Confidence",
        }
    };
 
    reporter.generate(options);  
    console.log('foi?!');
}

teste();