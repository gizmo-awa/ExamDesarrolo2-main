package com.lharo.exam

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ApplicationsAdapter (context: Context, feedEntries: ArrayList<MovieModel>):
    RecyclerView.Adapter<ApplicationsAdapter.ViewHolder>() {
    private var localContext: Context? = null
    private var localFeedEntries: ArrayList<MovieModel>? = null
    init {
        localContext = context
        localFeedEntries = feedEntries
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ApplicationsAdapter.ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(localContext)
        val view: View = layoutInflater.inflate(R.layout.activity_movie_feed, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ApplicationsAdapter.ViewHolder, position: Int) {
        val currentFeedEntry: MovieModel = localFeedEntries!![position]
        holder.textTitle.text = currentFeedEntry.title
        holder.textYear.text = currentFeedEntry.year
        holder.textLanguage.text = currentFeedEntry.language
        holder.textDirector.text = currentFeedEntry.director
    }

    override fun getItemCount(): Int {
        return localFeedEntries?.size ?: 0
    }

    class ViewHolder(v: View): RecyclerView.ViewHolder(v) {
        val textTitle: TextView = v.findViewById(R.id.text_movieName)
        val textYear: TextView = v.findViewById(R.id.text_movieYear)
        val textLanguage: TextView = v.findViewById(R.id.text_movieL)
        val textDirector: TextView = v.findViewById(R.id.text_movieDirector)
    }
}