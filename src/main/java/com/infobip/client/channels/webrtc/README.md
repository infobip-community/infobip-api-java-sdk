WebRTC
======

Infobip Web and In-App Calls provide a simplified and secure way of real-time audio and video communication over the web and inside mobile applications. It's powered by Web Real-Time Communication (WebRTC) technology, the leading real-time communication standard built into more than a billion devices. This means it's safe and easy to use both for you and for your end users. Learn more about [Web and In-App Calls](https://www.infobip.com/docs/voice-and-video/web-and-in-app-calls) and [Video Calls](https://www.infobip.com/docs/voice-and-video/video).

##### Example (WebRTC Token)

```java
WebrtcTokenRequest request = new WebrtcTokenRequest("someIdentity")
    .applicationId("2277594c-76ea-4b8e-a299-e2b6db41b9dc");
```

```java
WebRtcTokenApi webRtcTokenApi = new WebRtcTokenApi(apiClient);
try {
    ApiResponse<WebrtcTokenResponse> response = webRtcTokenApi.generateWebrtcToken(request);
} catch (ApiException e) {
   // HANDLE THE EXCEPTION
}
```

##### Example (WebRTC applications)

```java
WebrtcApplicationRequest request = new WebrtcApplicationRequest("someName");
```

```java
WebRtcTokenApi webRtcTokenApi = new WebRtcTokenApi(apiClient);
try {
ApiResponse<WebrtcApplicationResponse> response = webRtcApplicationsApi.saveWebrtcApplication(request);
} catch (ApiException e) {
   // HANDLE THE EXCEPTION
}
```
