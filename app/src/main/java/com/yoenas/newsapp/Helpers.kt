package com.yoenas.newsapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.yoenas.newsapp.data.DataNews

fun initViewHeadline(view: View, position: Int) {
    val imgHeadline: ImageView = view.findViewById(R.id.img_news_headline)
    val tvTitleHeadline: TextView = view.findViewById(R.id.tv_title_headline)
    val tvDescHeadline: TextView = view.findViewById(R.id.tv_desc_headline)
    val tvDateHeadline: TextView = view.findViewById(R.id.tv_date_headline)
    val tvAuthorHeadline: TextView = view.findViewById(R.id.tv_author_headline)

    imgHeadline.setImageResource(DataNews.photoHeadline[position])
    tvTitleHeadline.text = DataNews.titleHeadline[position]
    tvDescHeadline.text = DataNews.contentHeadline[position]
    tvDateHeadline.text = DataNews.dateHeadline[position]
    tvAuthorHeadline.text = DataNews.authorHeadline[position]
}