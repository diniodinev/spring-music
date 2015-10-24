package org.cloudfoundry.samples.music.config.geb.page

import geb.Page

class MainPage extends Page {

    static url = ""
    static at = { title == "Spring Music" }

    static content = {
		sortByTtitle { $(".page-header > div > a[ng-click*='title']") }
		sortByArtist { $(".page-header > div > a[ng-click*='artist']") }
		sortByRleaseYear { $(".page-header > div > a[ng-click*='releaseYear']") }
		sortByGenre { $(".page-header > div > a[ng-click*='genre']") } 
		sortOrder { $(".page-header > div > a[ng-click='sortDescending=!sortDescending']") }
    }

}