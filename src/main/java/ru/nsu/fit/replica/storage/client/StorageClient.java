package ru.nsu.fit.replica.storage.client;

import ru.nsu.fit.replica.storage.Storage;

public class StorageClient<K, V> implements Storage {
    @Override
    public void put(Object key, Object value) {
        throw new RuntimeException("todo");
    }

    @Override
    public Object get(Object key) {
        throw new RuntimeException("todo");
    }
}
