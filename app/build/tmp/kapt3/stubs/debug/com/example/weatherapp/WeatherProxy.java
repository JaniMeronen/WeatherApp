package com.example.weatherapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/weatherapp/WeatherProxy;", "Lcom/example/weatherapp/WeatherServer;", "()V", "service", "Lcom/example/weatherapp/OpenMeteoService;", "kotlin.jvm.PlatformType", "tryGetWeather", "Lcom/example/weatherapp/WeatherInfo;", "latitude", "", "longitude", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherProxy implements com.example.weatherapp.WeatherServer {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weatherapp.WeatherProxy INSTANCE = null;
    private static final com.example.weatherapp.OpenMeteoService service = null;
    
    private WeatherProxy() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object tryGetWeather(double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.weatherapp.WeatherInfo> continuation) {
        return null;
    }
}