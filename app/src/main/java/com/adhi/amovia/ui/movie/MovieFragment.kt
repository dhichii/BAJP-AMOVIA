package com.adhi.amovia.ui.movie

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.adhi.amovia.data.source.local.entity.MovieEntity
import com.adhi.amovia.databinding.FragmentMovieBinding
import com.adhi.amovia.ui.detail.DetailMovieActivity
import com.adhi.amovia.utils.Utility.loading
import com.adhi.amovia.viewmodel.ViewModelFactory

class MovieFragment : Fragment() {
    private lateinit var adapter: MovieAdapter
    private var _binding: FragmentMovieBinding? = null
    private val binding get() = _binding
    private val viewModelFactory = ViewModelFactory.getInstance()
    private val viewModel: MovieViewModel by viewModels { viewModelFactory }

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

            viewModel.getMovies().observe(viewLifecycleOwner, {
                if (it != null) {
                    binding?.progressBar?.loading(false)
                    adapter.setMovie(it)
                }
            })

            adapter = MovieAdapter()

            with(binding?.rvMovies) {
                if (context?.resources?.configuration?.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    this?.layoutManager = GridLayoutManager(context, 4)
                } else {
                    this?.layoutManager = GridLayoutManager(context, 2)
                }
                this?.setHasFixedSize(true)
                this?.adapter = adapter
            }

            adapter.setOnItemClickCallback(object : MovieAdapter.OnItemClickCallback {
                override fun onItemClicked(data: MovieEntity) = showDetail(data)
            })
        }

        binding?.progressBar?.loading(true)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun showDetail(data: MovieEntity) {
        val intent = Intent(context, DetailMovieActivity::class.java)
        intent.putExtra(DetailMovieActivity.EXTRA_MOVIE, data.id)
        startActivity(intent)
    }
}