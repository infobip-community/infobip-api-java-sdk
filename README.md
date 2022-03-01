# Infobip API Java Client

This is a Java Client for Infobip API and you can use it as a dependency when you want to consume [Infobip APIs](https://www.infobip.com/docs/api) in your application.
To use this, you'll need an Infobip account. You can create a freetrial account [here](https://www.infobip.com/signup).

<img src="https://udesigncss.com/wp-content/uploads/2020/01/Infobip-logo-transparent.png" height="48px" alt="Infobip" />

#### Table of contents:
* [Documentation](#documentation)
* [General Info](#general-info)
* [Installation](#installation)
* [Quickstart](#quickstart)
* [Ask for help](#ask-for-help)

## Documentation

Detailed documentation about Infobip API can be found [here](https://www.infobip.com/docs/api).

## General Info
For `infobip-api-java-client` versioning we use [Semantic Versioning][semver] scheme.

Published under [MIT License][license].

Compiled with Java 8.

## Installation

#### Maven Central

Simply add the following in your project's POM file under `dependencies` tag:

```xml
<dependency>
      <groupId>com.infobip</groupId>
      <artifactId>infobip-api-java-client</artifactId>
      <version>3.2.0</version>
</dependency>
```

#### Compile manually

If you decide to take a manual approach, you need the following installed and available in your `$PATH`:
- Java 8
- [Apache Maven v3.3.4 or greater](https://maven.apache.org/download.cgi)

To compile it proceed with following:

    $ git clone git@github.com:infobip/infobip-api-java-client
    $ cd infobip-api-java-client
    $ mvn install       # Requires maven, download from https://maven.apache.org/download.html

#### Build JAR manually
If you want to build your own .jar, execute the following from within the cloned directory:

    $ git clone git@github.com:infobip/infobip-api-java-client
    $ cd infobip-api-java-client
    $ mvn package       # Requires maven, download from https://maven.apache.org/download.html
    
## Quickstart

#### Initialize the Client

```java
        ApiClient apiClient = new ApiClient();
        apiClient.setApiKey(API_KEY);
        apiClient.setBasePath(BASE_PATH);
```

#### Send a text message to a single recipient.

```java
        SendWhatsAppMessageApi sendWhatsAppMessageApi = new SendWhatsAppMessageApi(apiClient);
        WhatsAppTextMessage whatsAppTextMessage =
                new WhatsAppTextMessage("441134960000", "441134960001",
                        new Content("Some text with url: http://example.com").previewUrl(true))
                                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                                .callbackData("Callback data")
                                .notifyUrl("https://www.example.com/whatsapp");
        try {
            ApiResponse<WhatsAppMessageResponse> response =
                    sendWhatsAppMessageApi.sendWhatsAppTextMessage(whatsAppTextMessage);
        } catch (ApiException e) {
            /* handle exception */
        }
```

#### For more examples please refer to the following links:

- [WhatsApp](src/main/java/com/infobip/client/channels/whatsapp/)
- [RCS Channel](src/main/java/com/infobip/client/channels/rcs/)
- [WebRTC](src/main/java/com/infobip/client/channels/webrtc/)

## Ask for help

Feel free to open issues on the repository for any issue or feature request. As per pull requests, for details check the `CONTRIBUTING` [file][contributing] related to it.

If it is, however, something that requires our imminent attention feel free to contact us @ [devrel@infobip.com](mailto:devrel@infobip.com).

- [Apidocs](https://www.infobip.com/docs/api)
- [Freetrial](https://www.infobip.com/docs/freetrial)
- [Signup](https://www.infobip.com/signup)
- [Semver](https://semver.org)
- [License][LICENSE]
- [Contributing][CONTRIBUTING]
