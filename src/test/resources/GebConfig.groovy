import geb.report.ScreenshotReporter
import org.openqa.selenium.firefox.FirefoxDriver

driver = {
    return new FirefoxDriver()
}

baseUrl = "http://192.168.99.100"

waiting {
    timeout = 20
    retryInterval = 1
}

reportsDir = "geb-reports"
reporter = new ScreenshotReporter()
reportOnTestFailureOnly = false
quitCachedDriverOnShutdown = false