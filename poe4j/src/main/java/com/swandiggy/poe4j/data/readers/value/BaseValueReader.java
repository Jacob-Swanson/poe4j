package com.swandiggy.poe4j.data.readers.value;

import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.util.io.BinaryReader;
import org.springframework.util.Assert;

/**
 * Ensures that a {@link ValueReader} reads the correct number of bytes.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public abstract class BaseValueReader<T> implements ValueReader<T> {
    @Override
    public T read(DatFileReader datFileReader, BinaryReader br, Class clazz) {
        long startPos = br.getPosition();

        T value = readInternal(datFileReader, br, clazz);

        long endPos = br.getPosition();

        Assert.isTrue(endPos == startPos + size(clazz), "number of bytes read incorrect");

        return value;
    }

    protected abstract T readInternal(DatFileReader reader, BinaryReader br, Class clazz);
}
