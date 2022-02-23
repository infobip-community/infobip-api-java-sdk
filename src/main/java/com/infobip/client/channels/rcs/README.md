RCS
===

Rich Communication Services (RCS) is a new, visually appealing messaging channel that offers rich functionalities to enable more engaging customer journeys. RCS is sometimes referred to as the “SMS 2.0”. It takes everything users and companies already love about SMS—100% reach, reliability, ease of use, security—and builds on this to create an even better method of communication. Through a rich feature set that allows the creation of branded messages incorporating multimedia, suggested reply buttons, barcode delivery, click-through options and more, brands now have a new way to develop relationships through 2-Way communication.

##### Example

```java
RcsRequest request = new RcsRequest("0123456", new ContentTypeText("someText"));
```

or

```java
RcsRequest request = new RcsRequest(            
        "01213456",
        new ContentTypeCarousel(
                Width.SMALL,
                Arrays.asList(
                        new ResourceContent().title("someTitle"),
                        new ResourceContent().title("anotherTitle")
                        )
                )
        );
```


```java
SendRcsApi sendRcsApi = new SendRcsApi(apiClient);
try {
    ApiResponse<RcsResponse> response = sendRcsApi.sendRcsMessage(request);
} catch (ApiException e) {
    // HANDLE THE EXCEPTION
}

```