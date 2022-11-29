package com.example.navigatorapp.recyclerEcPlayers.adapter

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigatorapp.recyclerEcPlayers.EcPlayer
import com.example.navigatorapp.databinding.ItemPlayerBinding

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemPlayerBinding.bind(view)
    @SuppressLint("SetTextI18n")
    fun render(ecPlayer: EcPlayer){
        binding.tvEcPlayerName.text = ecPlayer.playerName
        binding.tvEcPlayerAge.text = "Ano: " + ecPlayer.Ano.toString()
        binding.tvEcPlayerTeam.text = "Equipo: " + ecPlayer.Equipo
        binding.tvEcPlayerPosition.text = ecPlayer.position
        Glide.with(binding.ivEcPlayer.context).load(ecPlayer.photo).into(binding.ivEcPlayer)
    }
}