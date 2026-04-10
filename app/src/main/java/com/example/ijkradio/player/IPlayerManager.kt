package com.example.ijkradio.player

import com.example.ijkradio.data.Station
import com.example.ijkradio.ui.PlaybackState
import kotlinx.coroutines.flow.Flow

/**
 * 播放器管理接口
 * 定义播放器的通用方法
 */
interface IPlayerManager {
    
    /**
     * 初始化播放器
     */
    fun initialize()
    
    /**
     * 释放播放器资源
     */
    fun release()
    
    /**
     * 播放电台
     */
    fun playStation(station: Station)
    
    /**
     * 暂停播放
     */
    fun pause()
    
    /**
     * 恢复播放
     */
    fun resume()
    
    /**
     * 停止播放
     */
    fun stop()
    
    /**
     * 设置音量
     */
    fun setVolume(volume: Float)
    
    /**
     * 设置硬解码
     */
    fun setHardwareDecode(useHardware: Boolean)
    
    /**
     * 检查是否正在播放
     */
    fun isPlaying(): Boolean
    
    /**
     * 获取当前播放的电台
     */
    fun getCurrentStation(): Station?
    
    /**
     * 获取播放状态
     */
    val playbackState: Flow<PlaybackState>
}