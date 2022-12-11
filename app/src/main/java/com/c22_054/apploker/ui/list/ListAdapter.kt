package com.c22_054.apploker.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.c22_054.apploker.databinding.ItemRowCategoryBinding

//class ListAdapter: PagingDataAdapter<ListPekerjaan, ListAdapter.ListViewHolder>(DIFF_CALLBACK) {
//    class ListViewHolder(private var binding: ItemRowCategoryBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//        fun bind(listPekerjaan: ListPekerjaan) {
//            binding.apply {
//                tvTitle.text = listPekerjaan.name
//                Glide.with(itemView.context)
//                    .load(listPekerjaan.photoUrl)
//                    .into(ivPerusahaan)
//                tvPerusahaan.text = listPekerjaan.perusahaan
//                tvDaerah.text = listPekerjaan.daerah
//            }
//        }
//    }
//
//    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
//        val data = getItem(position)
//        if (data != null) {
//            holder.bind(data)
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
//        val binding =
//            ItemRowCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return ListViewHolder(binding)
//    }
//
//    companion object {
//        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ListPekerjaan>() {
//
//            override fun areItemsTheSame(oldItem: ListPekerjaan, newItem: ListPekerjaan): Boolean {
//                return oldItem == newItem
//            }
//
//            override fun areContentsTheSame(oldItem: ListPekerjaan, newItem: ListPekerjaan): Boolean {
//                return oldItem.id == newItem.id
//            }
//
//        }
//    }
//}