# Platform Engineering Java 21

Demo application used to demonstrate a Platform Engineering Golden Path.

## Architecture

```text
Developer
   |
   v
platform-engineering-java21
   |  consumes
   v
platform-engineering-templates
   |
   v
GitHub Actions
  |-- build-and-test
  `-- quality-gate
```

The application team owns the Java code. The platform team owns the reusable CI/CD capability.

## Run locally

Requires Java 21 and Maven.

```bash
mvn spring-boot:run
```

Then call:

```bash
curl http://localhost:8080/api/platform
```

Expected response:

```json
{
  "message": "Hello from a Platform Engineering Golden Path",
  "java": "21"
}
```

## Exercise

1. Push a change to the application.
2. Observe that the application workflow invokes the reusable workflow from the platform repository.
3. Add a `security-scan` job to the platform workflow.
4. Publish it as `v2` and update this repository to consume `@v2`.

The goal is to demonstrate how platform capabilities evolve centrally while application teams keep their repositories simple.
