package ru.nsu.fit.replica.storage;

import lombok.Data;

@Data
public class StorageMessage<K, V> {
    private StorageAction action;
    private long actionId;
    private K key;
    private V value;
}
