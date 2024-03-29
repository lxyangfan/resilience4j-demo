## 介绍

使用 Resilience4j 实现限流、熔断、重试、舱壁隔离等功能。

## 限流

限流是指对系统的并发量进行限制，当并发量超过限制时，系统将拒绝服务。

单服务限流可以使用 Guava RateLimiter，但是当服务数量增多时，需要对每个服务进行限流，这时候就需要使用限流组件。

Resilience4j 提供了限流组件，可以对服务进行限流。

## 熔断

熔断是指当服务出现故障时，系统将拒绝服务，避免故障扩散。
