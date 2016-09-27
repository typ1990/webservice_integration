package com.cn.service;

import org.springframework.messaging.Message;

import java.util.List;

/**
 * Created by lisa on 2016/9/26.
 */
public interface CompletionStrategy {
    boolean isComplete(List<Message<?>> messages);
}
