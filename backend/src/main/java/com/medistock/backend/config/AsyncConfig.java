package com.medistock.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/** Lets notifications be sent in the background, so a slow email never delays a request. */
@Configuration
@EnableAsync
public class AsyncConfig {
}
