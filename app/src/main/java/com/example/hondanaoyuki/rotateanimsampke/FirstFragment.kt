package com.example.hondanaoyuki.rotateanimsampke

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    // Fragmentで表示するViewを作成するメソッド
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        // 先ほどのレイアウトをここでViewとして作成します
        return inflater.inflate(R.layout.fragment_first, container, false)
    }
}