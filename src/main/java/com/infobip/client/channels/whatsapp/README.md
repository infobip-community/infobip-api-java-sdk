WhatsApp
========

Send and receive simple messages, pre-set buttons, or rich media message by using our extensive WhatApp API. Getting started is easy. Even in trial, you can experience WhatApp two-way communication easily putting yourself in your customer's shoes.

##### Example

`WhatsAppAudioMessage` example:

```java
        new WhatsAppAudioMessage("441134960000", "441134960001",
                new Content("http://example.com/audio"))
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp");
```

`WhatsAppContactMessage` example:

```java
        new WhatsAppContactMessage("441134960000", "441134960001",
                new Content(Arrays.asList(
                        new Contact(new Name("John", "Mr. John Smith").lastName("Smith")
                                .middleName("B")
                                .nameSuffix("doc.")
                                .namePrefix("Mr."))
                                        .addresses(Arrays.asList(
                                                new Address().street("Istarska")
                                                        .city("Vodnjan")
                                                        .state("HR")
                                                        .zip("52215")
                                                        .country("Croatia")
                                                        .countryCode("HR")
                                                        .type(AddressType.WORK),
                                                new Address().street("Istarska")
                                                        .city("Vodnjan")
                                                        .state("HR")
                                                        .zip("52215")
                                                        .country("Croatia")
                                                        .countryCode("HR")
                                                        .type(AddressType.HOME)))
                                        .birthday("2010-01-01")
                                        .emails(Arrays.asList(
                                                new Email().email("John.Smith@example.com")
                                                        .type(EmailType.WORK),
                                                new Email().email("John.Smith.priv@example.com")
                                                        .type(EmailType.HOME)))
                                        .org(new Org().company("Company Name")
                                                .department("Department")
                                                .title("Director"))
                                        .phones(Arrays.asList(
                                                new Phone().phone("+441134960019")
                                                        .type(PhoneType.HOME)
                                                        .waId("441134960019"),
                                                new Phone().phone("+441134960000")
                                                        .type(PhoneType.WORK)
                                                        .waId("441134960000")))
                                        .urls(Arrays.asList(
                                                new Url().url("http://example.com/John.Smith")
                                                        .type(UrlType.WORK),
                                                new Url().url("http://example.com/home/John.Smith")
                                                        .type(UrlType.HOME))),
                        new Contact(new Name("Alexander", "Mr. Alexander Abraham")))))
                                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                                .callbackData("Callback data")
                                .notifyUrl("https://www.example.com/whatsapp");
```

`WhatsAppDocumentMessage` example:

```java
        new WhatsAppDocumentMessage("441134960000", "441134960001",
                new Content("http://example.com/document").caption("Some document caption")
                        .filename("filename.pdf")).messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                                .callbackData("Callback data")
                                .notifyUrl("https://www.example.com/whatsapp");
```
