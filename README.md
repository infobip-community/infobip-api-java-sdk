# Infobip API Java SDK

[![Latest Stable Version](https://poser.pugx.org/infobip-community/infobip-api-java-sdk/v/stable)](https://packagist.org/packages/infobip-community/infobip-api-java-sdk)
[![Latest Unstable Version](https://poser.pugx.org/infobip-community/infobip-api-java-sdk/v/unstable)](https://packagist.org/packages/infobip-community/infobip-api-java-sdk)
[![Total Downloads](https://poser.pugx.org/infobip-community/infobip-api-java-sdk/downloads)](https://packagist.org/packages/infobip-community/infobip-api-java-sdk/stats)
[![License](https://poser.pugx.org/infobip-community/infobip-api-java-sdk/license)](LICENSE)

This is a Java SDK for Infobip API and you can use it as a dependency to add [Infobip APIs](https://www.infobip.com/docs/api) features to your application.
To use this, you'll need an Infobip account. If you do not own one, you can create a [free account here](https://www.infobip.com/signup).

#### Table of contents:

* [General Info](#general-info)
* [License](#license)
* [Installation](#installation)
* [Quickstart Guide](#quickstart-guide)
* [Documentation](#documentation)
* [Development](#development)

## General Info

For `infobip-api-java-sdk` versioning we use [Semantic Versioning](https://semver.org) scheme.

## License

Published under [MIT License](LICENSE).

## Installation

#### Maven Central

`infobip-api-java-sdk` is published to Maven Central Repository.

To use it, we need to add the following dependency:

```xml
<dependency>
  <groupId>io.github.infobip-community</groupId>
  <artifactId>infobip-api-java-sdk</artifactId>
  <version>1.0.0</version>
</dependency>
```

#### Manual approach

If you decide to take a manual approach, you need the following installed and available in your `$PATH`:
- Java 8 or greater
- Apache Maven v3 or greater

After cloning of `infobip-api-java-sdk` repository you can use:

```
mvn install
```

to install SDK into your Local Maven Repository (`~/.m2` folder), or

```
mvn package
```

to build your own .jar file, documentation and sources (under `infobip-api-java-sdk/target` folder).

## Quickstart Guide

(1) Complete the [installation](#installation) process and make sure that you have `infobip-api-java-sdk` as dependency in your project.

(2) Initialize the API Client with `API_KEY` and `BASE_PATH` which you'll get after [creating the free account](https://www.infobip.com/signup):

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey(API_KEY);
apiClient.setBasePath(BASE_PATH);
```

Note about **API Authentication**:

Currently, `infobip-api-java-sdk` only supports API Key authentication, and the key needs to be passed during client creation.
This will most likely change with future versions, once more authentication methods are included.

(3) To be able to send, for example, [WhatsApp Text message](https://www.infobip.com/docs/api#channels/whatsapp/send-whatsapp-text-message) initialize the `SendWhatsAppMessageApi` with `ApiClient`:

```java
SendWhatsAppMessageApi sendWhatsAppMessageApi = new SendWhatsAppMessageApi(apiClient);
```

prepare the `WhatsAppTextMessage` (request):

```java
WhatsAppTextMessage whatsAppTextMessage =
        new WhatsAppTextMessage("441134960000", "441134960001",
                new Content("Some text with url: http://example.com")
                .previewUrl(true))
        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
        .callbackData("Callback data")
        .notifyUrl("https://www.example.com/whatsapp");
```

and send it:

```java
ApiResponse<WhatsAppMessageResponse> response = 
        sendWhatsAppMessageApi.sendWhatsAppTextMessage(whatsAppTextMessage);
```

Complete code may look like this:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey(API_KEY);
apiClient.setBasePath(BASE_PATH);

SendWhatsAppMessageApi sendWhatsAppMessageApi = new SendWhatsAppMessageApi(apiClient);

WhatsAppTextMessage whatsAppTextMessage =
        new WhatsAppTextMessage("441134960000", "441134960001",
                new Content("Some text with url: http://example.com")
                .previewUrl(true))
        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
        .callbackData("Callback data")
        .notifyUrl("https://www.example.com/whatsapp");

try {
    ApiResponse<WhatsAppMessageResponse> response =
            sendWhatsAppMessageApi.sendWhatsAppTextMessage(whatsAppTextMessage);
} catch (ApiException e) {
    /* handle exceptions */
}
```

Please note how above (WhatsAppTextMessage) **request** is created; [Fluent Interface](https://en.wikipedia.org/wiki/Fluent_interface) design pattern is the only way to create request(s) within `infobip-api-java-sdk`. Request creation is designed in such way that all **required parameters are provided to constructor** while **optional parameters can be added with method chaining**.

#### For more examples please refer to the following links:

- [WhatsApp](src/main/java/com/infobip/client/channels/whatsapp/)
- [RCS Channel](src/main/java/com/infobip/client/channels/rcs/)
- [WebRTC](src/main/java/com/infobip/client/channels/webrtc/)

## Documentation

Infobip API Documentation can be found [here](https://www.infobip.com/docs/api).

## Development

Feel free to participate in this open source project. For details check our [contribution guidelines](CONTRIBUTING.md).
