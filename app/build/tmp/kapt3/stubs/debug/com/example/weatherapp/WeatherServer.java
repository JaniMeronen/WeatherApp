package com.example.weatherapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/weatherapp/WeatherServer;", "", "tryGetWeather", "Lcom/example/weatherapp/WeatherInfo;", "latitude", "", "longitude", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeatherServer {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object tryGetWeather(double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.weatherapp.WeatherInfo> continuation);
}