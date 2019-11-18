package ru.nsu.fit.replica.storage.server;

import ru.nsu.fit.replica.storage.Storage;

public interface StorageReaderServer<K, V> extends Storage {
    StorageWriterServer promoteToWriter();
    void initalSync();
}
