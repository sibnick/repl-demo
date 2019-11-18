package ru.nsu.fit.replica;

import lombok.Data;

import java.util.Map;

@Data
public class Message {
    private byte[] data;
    private Map<String, String> headers;
}
