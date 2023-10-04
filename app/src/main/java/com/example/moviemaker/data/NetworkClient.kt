package com.example.moviemaker.data

import com.example.moviemaker.data.dto.Response

interface NetworkClient {
    fun doRequest(dto: Any): Response
}