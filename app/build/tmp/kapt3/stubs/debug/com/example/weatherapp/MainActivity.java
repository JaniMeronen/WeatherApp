package com.example.weatherapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/weatherapp/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "<set-?>", "Lcom/example/weatherapp/MainActivity$WeatherState;", "state", "getState", "()Lcom/example/weatherapp/MainActivity$WeatherState;", "setState", "(Lcom/example/weatherapp/MainActivity$WeatherState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "tryLocate", "Landroid/location/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WeatherState", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity {
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.weatherapp.MainActivity.WeatherState getState() {
        return null;
    }
    
    private final void setState(com.example.weatherapp.MainActivity.WeatherState p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.lang.Object tryLocate(kotlin.coroutines.Continuation<? super android.location.Location> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/example/weatherapp/MainActivity$WeatherState;", "", "error", "", "isLoading", "", "weatherInfo", "Lcom/example/weatherapp/WeatherInfo;", "(Ljava/lang/String;ZLcom/example/weatherapp/WeatherInfo;)V", "getError", "()Ljava/lang/String;", "()Z", "getWeatherInfo", "()Lcom/example/weatherapp/WeatherInfo;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
    static final class WeatherState {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String error = null;
        private final boolean isLoading = false;
        @org.jetbrains.annotations.Nullable()
        private final com.example.weatherapp.WeatherInfo weatherInfo = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.weatherapp.MainActivity.WeatherState copy(@org.jetbrains.annotations.Nullable()
        java.lang.String error, boolean isLoading, @org.jetbrains.annotations.Nullable()
        com.example.weatherapp.WeatherInfo weatherInfo) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public WeatherState() {
            super();
        }
        
        public WeatherState(@org.jetbrains.annotations.Nullable()
        java.lang.String error, boolean isLoading, @org.jetbrains.annotations.Nullable()
        com.example.weatherapp.WeatherInfo weatherInfo) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getError() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isLoading() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.weatherapp.WeatherInfo component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.weatherapp.WeatherInfo getWeatherInfo() {
            return null;
        }
    }
}