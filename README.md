# Infobip API Java SDK

[![Maven Central](https://badgen.net/maven/v/maven-central/io.github.infobip-community/infobip-api-java-sdk?icon=maven)](https://search.maven.org/artifact/io.github.infobip-community/infobip-api-java-sdk)
[![License](https://badgen.net/github/license/infobip-community/infobip-api-java-sdk)](LICENSE)
[![Workflow](https://img.shields.io/github/workflow/status/infobip-community/infobip-api-java-sdk/Java%20CI)](https://github.com/infobip-community/infobip-api-java-sdk/actions/workflows/ci.yaml)
[![Repo Size](https://img.shields.io/github/repo-size/infobip-community/infobip-api-java-sdk)]()

This is a Java SDK that you can use as a dependency to add [Infobip API](https://www.infobip.com/docs/api) features to your application.

<img src="https://udesigncss.com/wp-content/uploads/2020/01/Infobip-logo-transparent.png" height="48px" alt="Infobip" />

## 📡 Supported channels

- [SMS Reference](https://www.infobip.com/docs/api#channels/sms)
- [Whatsapp Reference](https://www.infobip.com/docs/api#channels/whatsapp)
- [Email Reference](https://www.infobip.com/docs/api#channels/email)
- [WebRTC Reference](https://www.infobip.com/docs/api#channels/webrtc/)
- [MMS Reference](https://www.infobip.com/docs/api#channels/mms)
- [RCS Reference](https://www.infobip.com/docs/api#channels/rcs)

More channels to be added in the near future.

## ℹ️ General Info

For `infobip-api-java-sdk` versioning we use [Semantic Versioning](https://semver.org) scheme.

In order to run use it in your project, you'll need Java 8 or greater, and Apache Maven v3 or greater.


## 🔐 Authentication

Currently, `infobip-api-java-sdk` only supports API Key authentication, and the key needs to be passed during client creation.
This will most likely change with future versions, once more authentication methods are included.

## 📦 Installation
#### Maven Central

`infobip-api-java-sdk` is published to Maven Central Repository.

To use it, we need to add the following dependency:

```xml
<dependency>
  <groupId>io.github.infobip-community</groupId>
  <artifactId>infobip-api-java-sdk</artifactId>
  <version>1.1.0</version>
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

## 🚀 Usage

To use this, you'll need an Infobip account. If you do not own one, you can create a [free account here](https://www.infobip.com/signup).

(1) Complete the [installation](#installation) process and make sure that you have `infobip-api-java-sdk` as dependency in your project.

(2) Initialize the API Client with `API_KEY` and `BASE_PATH` which you'll get after [creating the free account](https://www.infobip.com/signup):

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey(API_KEY);
apiClient.setBasePath(BASE_PATH);
```

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
        .messageId("a28dd97c-XXXX-XXXX-XXXX-XXXXXXXXXXXX")
        .callbackData("Callback data")
        .notifyUrl("https://www.example.com/whatsapp");
```

and send it:

```java
try {
    ApiResponse<WhatsAppMessageResponse> response = 
            sendWhatsAppMessageApi.sendWhatsAppTextMessage(whatsAppTextMessage);
} catch (ApiException e) {
    /* handle exceptions */
}
```

Please note how above (WhatsAppTextMessage) **request** is created; [Fluent Interface](https://en.wikipedia.org/wiki/Fluent_interface) design pattern is the only way to create request(s) within `infobip-api-java-sdk`. Request creation is designed in such way that all **required parameters are provided to constructor** while **optional parameters can be added with method chaining**.

#### For more examples please refer to the following links:

- [SMS](src/test/java/io/github/infobip_community/client/channels/sms/model/)
- [MMS](src/test/java/io/github/infobip_community/client/channels/mms/model/)
- [Email](src/test/java/io/github/infobip_community/client/channels/email/model/)
- [WhatsApp](src/test/java/io/github/infobip_community/client/channels/whatsapp/model/)
- [RCS](src/test/java/io/github/infobip_community/client/channels/rcs/model/)
- [WebRTC](src/test/java/io/github/infobip_community/client/channels/webrtc/model/)

## 🛠 API Exception
Fields provided within `ApiException` object are `responseCode` referring to the HTTP Code response, as well as the `responseHeaders` and `responseBody`.

```java
    apiException.getResponseCode();
    apiException.getResponseHeaders();
    apiException.getResponseBody();
```

Use them to handle exceptions and understand the reasoning behind API call failure.

## 🧪 Testing

To run tests position yourself in the project's root and run:

```
mvn test
```

## ⚖️ License

This library is distributed under the MIT license found in the [LICENSE](LICENSE) file.

## 🆘 Want to help and improve open source SDK?
Check out our [contributing guide](CONTRIBUTING.md) and [code of conduct](CODE_OF_CONDUCT.md).