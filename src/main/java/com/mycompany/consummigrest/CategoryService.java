/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.consummigrest;

import java.util.List;
import okhttp3.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author ro
 */
public interface CategoryService {
    
    @GET("/categories")
    Call<List<CategoryRs>> getAllCategories();
    
    @POST("/categories")
    Call<HttpStatus> save(@Body CategoryRs categoryRs);
    
    @PATCH("/categories")
    Call<HttpStatus> update(@Body CategoryRs categoryRs);
    
    @DELETE("/categories/{id}")
    Call<HttpStatus> delete(@Path("id") int id);
      
    
}
