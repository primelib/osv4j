# *OSV4J*

[![Maven Central](https://img.shields.io/maven-central/v/io.github.primelib/osv4j)](https://central.sonatype.com/artifact/io.github.primelib/osv4j)
[![javadoc](https://javadoc.io/badge2/io.github.primelib/osv4j/javadoc.svg)](https://javadoc.io/doc/io.github.primelib/osv4j)

> A java library for the [OSV](https://osv.dev/) API.

## Installation

```gradle
implementation("io.github.primelib:osv4j:<latestVersion>")
```

[Click to view instructions for other build tools](https://central.sonatype.com/artifact/io.github.primelib/osv4j).

## Usage

*Consumer Specification Approach*

```java
OSVConsumerApi client = OSVFactory.create(spec -> {
    spec.api(OSVConsumerApi.class);
});

client.getVulnById(spec -> spec.id("GHSA-jfh8-c2jp-5v3q"));
```

*Parameter Approach*

```java
OSVApi client = OSVFactory.create(spec -> {
    spec.api(OSVApi.class);
});

client.getVulnById("GHSA-jfh8-c2jp-5v3q");
```

**_NOTE:_** The  `Parameter Approach` can break if the API changes. The `Consumer Specification Approach` is more resilient to API changes.

## Links

- [Documentation](https://primelib.github.io)
- [Contribute](https://primelib.github.io/contribution/)

## License

Released under the [MIT License](./LICENSE).
