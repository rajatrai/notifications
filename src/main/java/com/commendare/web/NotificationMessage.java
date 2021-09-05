package com.commendare.web;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class NotificationMessage {
    /**
     * This models the notification message to be sent
     */
    String name;
    String message;
}
