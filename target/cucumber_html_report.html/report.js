$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchfilter.feature");
formatter.feature({
  "line": 1,
  "name": "Filter option under search result page",
  "description": "",
  "id": "filter-option-under-search-result-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1978497300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I visited the web application",
  "keyword": "Given "
});
formatter.match({
  "location": "Searchfilter.i_visited_the_web_application()"
});
formatter.result({
  "duration": 3067255900,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Rent property should be visible according to the filter",
  "description": "",
  "id": "filter-option-under-search-result-page;rent-property-should-be-visible-according-to-the-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@whole5"
    },
    {
      "line": 6,
      "name": "@sc5.1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I search different location in the search bar under rent option",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "filter was set as per the need",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Property with the selected checkboxes should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "Searchfilter.i_search_different_location_in_the_search_bar_under_rent_option()"
});
formatter.result({
  "duration": 960089200,
  "status": "passed"
});
formatter.match({
  "location": "Searchfilter.filter_was_set_as_per_the_need()"
});
formatter.result({
  "duration": 15123553200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"div[id\u003d\u0027A\u0027] span\"}\n  (Session info: chrome\u003d91.0.4472.124)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-I3RIRH0\u0027, ip: \u0027192.168.0.105\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.11\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 91.0.4472.101 (af52a90bf870..., userDataDir: C:\\Users\\TUSHAR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:59095}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4ac53afbb226a2cddd9a3ed808cad090\n*** Element info: {Using\u003dcss selector, value\u003ddiv[id\u003d\u0027A\u0027] span}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy24.click(Unknown Source)\r\n\tat pageobjects.Pom3.availablefromselected(Pom3.java:155)\r\n\tat stepdefinitons.Searchfilter.filter_was_set_as_per_the_need(Searchfilter.java:171)\r\n\tat ✽.And filter was set as per the need(searchfilter.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Searchfilter.property_with_the_selected_checkboxes_should_be_visible()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 52092500,
  "status": "passed"
});
});