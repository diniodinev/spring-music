package org.cloudfoundry.samples.music.config.geb

import  org.cloudfoundry.samples.music.config.geb.page.MainPage
import geb.spock.GebReportingSpec

class DemoSpec extends GebReportingSpec {

    def "test"() {
        setup:
        def pg = to MainPage

        when:
        pg.sortByTtitle.click()

        then:
        at MainPage
    }
}