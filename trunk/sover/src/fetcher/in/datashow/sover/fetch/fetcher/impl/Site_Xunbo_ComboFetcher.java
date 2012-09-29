package in.datashow.sover.fetch.fetcher.impl;

import in.datashow.sover.fetch.EpisodeFetchConfig;
import in.datashow.sover.fetch.MovieFetchStrategy;
import in.datashow.sover.fetch.fetcher.EpisodeFetcher;
import in.datashow.sover.fetch.fetcher.MovieFetcher;
import in.datashow.sover.orm.Episode;
import in.datashow.sover.orm.Movie;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("xunbo.cc")
public class Site_Xunbo_ComboFetcher implements MovieFetcher, EpisodeFetcher {

	@Override
	public List<Episode> fetchEpisode(EpisodeFetchConfig config) {
		return null;
	}

	@Override
	public List<Movie> fetchMovie(MovieFetchStrategy config) {
		return null;
	}

	@Override
	public Movie fetchMovie(String url) {
		return null;
	}
}
