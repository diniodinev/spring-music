import geb.report.ScreenshotReporter
import org.openqa.selenium.firefox.FirefoxDriver

driver = {
    return new FirefoxDriver()
}

baseUrl = "http://appsetup_proxy_1"

waiting {
    timeout = 20
    retryInterval = 1
}

reportsDir = "geb-reports"
reporter = new ScreenshotReporter()
reportOnTestFailureOnly = false
quitCachedDriverOnShutdown = false