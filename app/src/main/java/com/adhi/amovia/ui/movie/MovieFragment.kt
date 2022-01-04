package com.adhi.amovia.ui.movie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.adhi.amovia.data.Film
import com.adhi.amovia.databinding.FragmentMovieBinding
import com.adhi.amovia.ui.adapter.ListAdapter
import com.adhi.amovia.ui.detail.DetailActivity

class MovieFragment : Fragment() {
    private lateinit var adapter: ListAdapter
    private var _binding: FragmentMovieBinding? = null
    private val binding get() = _binding
    private val viewModel by viewModels<MovieViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val movies = viewModel.getMovie()
            adapter = ListAdapter()
            adapter.setFilm(movies)

            with(binding?.rvMovies) {
                this?.layoutManager = LinearLayoutManager(context)
                this?.setHasFixedSize(true)
                this?.adapter = adapter
            }

            adapter.setOnItemClickCallback(object : ListAdapter.OnItemClickCallback {
                override fun onItemClicked(data: Film) = showDetail(data)
            })
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun showDetail(data: Film) {
        val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_FILM, data.id)
        startActivity(intent)
    }
}