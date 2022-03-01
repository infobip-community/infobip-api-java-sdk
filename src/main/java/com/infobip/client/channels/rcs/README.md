RCS
===

Rich Communication Services (RCS) is a new, visually appealing messaging channel that offers rich functionalities to enable more engaging customer journeys. RCS is sometimes referred to as the “SMS 2.0”. It takes everything users and companies already love about SMS—100% reach, reliability, ease of use, security—and builds on this to create an even better method of communication. Through a rich feature set that allows the creation of branded messages incorporating multimedia, suggested reply buttons, barcode delivery, click-through options and more, brands now have a new way to develop relationships through 2-Way communication.

##### Example

`RcsBulkMessage` example:

```java
        new RcsBulkMessage().messages(Arrays.asList(
                new RcsMessage("385977666618", new TextContent("exampleText 1")),
                new RcsMessage("385977666618",
                        new TextContent("exampleText 2").suggestions(Arrays.asList(
                                new ReplySuggestion("exampleText", "examplePostbackData"),
                                new OpenUrlSuggestion("exampleText", "examplePostbackData",
                                        "http://www.example.test"),
                                new DialPhoneSuggestion("exampleText", "examplePostbackData")
                                        .phoneNumber("385977666618"),
                                new ShowLocationSuggestion("exampleText", "examplePostbackData",
                                        45.793418, 15.946297).label("label"),
                                new RequestLocationSuggestion("exampleText",
                                        "examplePostbackData")))).from("myRcsSender")
                                                .validityPeriod(15)
                                                .validityPeriodTimeUnit(
                                                        ValidityPeriodTimeUnit.MINUTES)
                                                .smsFailover(
                                                        new SmsFailover("441134960000", "Some text")
                                                                .validityPeriod(20)
                                                                .validityPeriodTimeUnit(
                                                                    ValidityPeriodTimeUnit.MINUTES))
                                                .notifyUrl("https://www.example.com/rcs")
                                                .callbackData("Callback data")
                                                .messageId("externalMessageId")));
```

`RcsMessage` example:


```java
        new RcsMessage("385977666618",
                new TextContent("exampleText").suggestions(Arrays.asList(
                        new ReplySuggestion("exampleText", "examplePostbackData"),
                        new OpenUrlSuggestion("exampleText", "examplePostbackData",
                                "https://www.example.test"),
                        new DialPhoneSuggestion("exampleText", "examplePostbackData")
                                .phoneNumber("385977666618"),
                        new ShowLocationSuggestion("exampleText", "examplePostbackData", 45.793418,
                                15.946297).label("label"),
                        new RequestLocationSuggestion("exampleText", "examplePostbackData"))))
                                .from("myRcsSender")
                                .validityPeriod(15)
                                .validityPeriodTimeUnit(ValidityPeriodTimeUnit.MINUTES)
                                .smsFailover(new SmsFailover("441134960000", "Some text")
                                        .validityPeriod(20)
                                        .validityPeriodTimeUnit(ValidityPeriodTimeUnit.MINUTES))
                                .notifyUrl("https://www.example.com/rcs")
                                .callbackData("Callback data")
                                .messageId("externalMessageId");
```
