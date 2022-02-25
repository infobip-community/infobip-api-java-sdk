# infobip-api-java-client-community

Infobip API Java Client - Community edition

## Quickstart Guide

#### Initialize the Client

```java
    ApiClient apiClient = new ApiClient();
    apiClient.setAuthenticationType(AuthenticationType.API_KEY);
    apiClient.setApiKey(API_KEY);
    apiClient.setBasePath(URL_BASE_PATH);
```

- [WhatsApp](src/main/java/com/infobip/client/channels/whatsapp/)
- [RCS Channel](src/main/java/com/infobip/client/channels/rcs/)
- [WebRTC](src/main/java/com/infobip/client/channels/webrtc/)