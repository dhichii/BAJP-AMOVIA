package com.adhi.amovia.utils

import com.adhi.amovia.data.source.local.entity.DetailMovieEntity
import com.adhi.amovia.data.source.local.entity.DetailTvEntity
import com.adhi.amovia.data.source.local.entity.MovieEntity
import com.adhi.amovia.data.source.local.entity.TvEntity
import com.adhi.amovia.data.source.remote.response.DetailMovieResponse
import com.adhi.amovia.data.source.remote.response.DetailTvResponse
import com.adhi.amovia.data.source.remote.response.MovieResponse
import com.adhi.amovia.data.source.remote.response.TvResponse

object DataDummy {
    fun dummyMovies(): List<MovieEntity> =
        arrayListOf(
            MovieEntity(
                634649,
                "/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                "Spider-Man: No Way Home",
                8.4
            ),
            MovieEntity(
                568124,
                "/4j0PNHkMr5ax3IA8tjtxcmPU3QT.jpg",
                "Ecanto",
                7.8
            ),
            MovieEntity(
                460458,
                "/6WR7wLCX0PGLhj51qyvK8MIxtT5.jpg",
                "Resident Evil: Welcome to Raccoon City",
                6.0
            ),
            MovieEntity(
                624860,
                "The Matrix Resurrections",
                "/gZlZLxJMfnSeS60abFZMh1IvODQ.jpg",
                7.0
            ),
            MovieEntity(
                580489,
                "/rjkmN1dniUHVYAtwuV3Tji7FsDO.jpg",
                "Venom: Let There Be Carnage",
                7.2
            ),
            MovieEntity(
                512195,
                "/lAXONuqg41NwUMuzMiFvicDET9Y.jpg",
                "Red Notice",
                6.8
            )
        )

    fun dummyRemoteMovies(): List<MovieResponse> =
        arrayListOf(
            MovieResponse(
                634649,
                "/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                "Spider-Man: No Way Home",
                8.4
            ),
            MovieResponse(
                568124,
                "/4j0PNHkMr5ax3IA8tjtxcmPU3QT.jpg",
                "Ecanto",
                7.8
            ),
            MovieResponse(
                460458,
                "/6WR7wLCX0PGLhj51qyvK8MIxtT5.jpg",
                "Resident Evil: Welcome to Raccoon City",
                6.0
            ),
            MovieResponse(
                624860,
                "The Matrix Resurrections",
                "/gZlZLxJMfnSeS60abFZMh1IvODQ.jpg",
                7.0
            ),
            MovieResponse(
                580489,
                "/rjkmN1dniUHVYAtwuV3Tji7FsDO.jpg",
                "Venom: Let There Be Carnage",
                7.2
            ),
            MovieResponse(
                512195,
                "/lAXONuqg41NwUMuzMiFvicDET9Y.jpg",
                "Red Notice",
                6.8
            )
        )

    fun dummyMovie(): DetailMovieEntity = DetailMovieEntity(
        634649,
        "/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
        "Spider-Man: No Way Home",
        "The Multiverse unleashed",
        8.4,
        3722,
        "2021-12-15",
        148,
        "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man."
    )

    fun dummyRemoteMovie(): DetailMovieResponse = DetailMovieResponse(
        634649,
        "/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
        "Spider-Man: No Way Home",
        "The Multiverse unleashed",
        8.4,
        3722,
        "2021-12-15",
        148,
        "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man."
    )

    fun dummyTvShows(): List<TvEntity> =
        arrayListOf(
            TvEntity(
                77169,
                "/6POBWybSBDBKjSs1VAQcnQC1qyt.jpg",
                "Cobra Kai",
                8.1
            ),
            TvEntity(
                115036,
                "/gNbdjDi1HamTCrfvM9JeA94bNi2.jpg",
                "The Book of Boba Fett",
                8.4
            ),
            TvEntity(
                71914,
                "/mpgDeLhl8HbhI03XLB7iKO6M6JE.jpg",
                "The Wheel of Time",
                8.0
            ),
            TvEntity(
                88329,
                "/pqzjCxPVc9TkVgGRWeAoMmyqkZV.jpg",
                "Hawkeye",
                8.4
            ),
            TvEntity(
                89614,
                "/avUmZDbbCcvnIFw0yrTM3A4CLlW.jpg",
                "Sword Snow Stride",
                6.9
            ),
            TvEntity(
                90462,
                "/iF8ai2QLNiHV4anwY1TuSGZXqfN.jpg",
                "Chucky",
                7.9
            )
        )

    fun dummyRemoteTvShows(): List<TvResponse> =
        arrayListOf(
            TvResponse(
                77169,
                "/6POBWybSBDBKjSs1VAQcnQC1qyt.jpg",
                "Cobra Kai",
                8.1
            ),
            TvResponse(
                115036,
                "/gNbdjDi1HamTCrfvM9JeA94bNi2.jpg",
                "The Book of Boba Fett",
                8.4
            ),
            TvResponse(
                71914,
                "/mpgDeLhl8HbhI03XLB7iKO6M6JE.jpg",
                "The Wheel of Time",
                8.0
            ),
            TvResponse(
                88329,
                "/pqzjCxPVc9TkVgGRWeAoMmyqkZV.jpg",
                "Hawkeye",
                8.4
            ),
            TvResponse(
                89614,
                "/avUmZDbbCcvnIFw0yrTM3A4CLlW.jpg",
                "Sword Snow Stride",
                6.9
            ),
            TvResponse(
                90462,
                "/iF8ai2QLNiHV4anwY1TuSGZXqfN.jpg",
                "Chucky",
                7.9
            )
        )

    fun dummyTv(): DetailTvEntity = DetailTvEntity(
        77169,
        "/6POBWybSBDBKjSs1VAQcnQC1qyt.jpg",
        "Cobra Kai",
        "Fight for the soul of the valley.",
        8.1,
        3949,
        "2018-05-02",
        30,
        "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi."
    )

    fun dummyRemoteTv(): DetailTvResponse = DetailTvResponse(
        77169,
        "/6POBWybSBDBKjSs1VAQcnQC1qyt.jpg",
        "Cobra Kai",
        "2018-05-02",
        "Fight for the soul of the valley.",
        8.1,
        3949,
        listOf(40),
        "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi."
    )
}