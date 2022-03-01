WebRTC
======

Infobip Web and In-App Calls provide a simplified and secure way of real-time audio and video communication over the web and inside mobile applications. It's powered by Web Real-Time Communication (WebRTC) technology, the leading real-time communication standard built into more than a billion devices. This means it's safe and easy to use both for you and for your end users. Learn more about [Web and In-App Calls](https://www.infobip.com/docs/voice-and-video/web-and-in-app-calls) and [Video Calls](https://www.infobip.com/docs/voice-and-video/video).

##### Example

`WebRtcApplication` example:

```java
        new WebRtcApplication("Application Name").description("Application Description")
                .ios(new Ios("IOS_APNS_certificate.p", "APNS certificate content")
                        .apnsCertificatePassword("secret"))
                .android(new Android("AAAAtm7JlCY:APA91bEe02qZQbfcTtmnPO..."))
                .appToApp(true)
                .appToConversations(true)
                .appToPhone(true);
```


`WebRtcToken` example:

```java
        new WebRtcToken("Alice").applicationId("2277594c-76ea-4b8e-a299-e2b6db41b9dc")
                .displayName("Alice in Wonderland")
                .capabilities(new Capabilities(Recording.ALWAYS))
                .timeToLive(43200L);
```
