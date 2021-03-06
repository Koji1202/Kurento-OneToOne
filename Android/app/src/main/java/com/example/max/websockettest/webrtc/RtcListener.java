package com.example.max.websockettest.webrtc;

import org.webrtc.MediaStream;

/**
 * Created by Max on 13-4-2015.
 * Implement this interface to be notified of events.
 */

public interface RtcListener{
    void onSocketCompleted();

    void onRegisterSuccessed();

    void onRegisterFailed();

    void onCallReceived(String from);

    void onCallReady(String callId);

    void onStatusChanged(String newStatus);
}