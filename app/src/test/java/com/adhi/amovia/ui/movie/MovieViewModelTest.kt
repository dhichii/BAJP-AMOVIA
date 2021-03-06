package com.adhi.amovia.ui.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.adhi.amovia.data.source.FilmRepository
import com.adhi.amovia.data.source.local.entity.MovieEntity
import com.adhi.amovia.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest {
    private lateinit var viewModel: MovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repo: FilmRepository

    @Mock
    private lateinit var observer: Observer<List<MovieEntity>>

    @Before
    fun setUp() {
        viewModel = MovieViewModel(repo)
    }

    @Test
    fun getMovies() {
        val dummyMovies = DataDummy.dummyMovies()
        val data = MutableLiveData<List<MovieEntity>>()
        data.value = dummyMovies

        `when`(repo.getMovies()).thenReturn(data)
        val movies = viewModel.getMovies().value
        verify(repo).getMovies()
        assertNotNull(movies)
        assertEquals(6, movies?.size)

        viewModel.getMovies().observeForever(observer)
        verify(observer).onChanged(dummyMovies)
    }
}