package com.example.PM01_Ejercicio2_2.Interfaces;

import com.example.PM01_Ejercicio2_2.Models.Usuarios;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.Call;

public interface UsuariosApi
{
    String Ruta = "/posts";

    @GET(Ruta)
    Call<List<Usuarios>> getUsuarios();
}
