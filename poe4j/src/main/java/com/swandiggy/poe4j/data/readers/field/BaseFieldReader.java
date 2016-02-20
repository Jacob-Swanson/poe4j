package com.swandiggy.poe4j.data.readers.field;

import com.swandiggy.poe4j.data.DatFileReader;
import com.swandiggy.poe4j.util.io.BinaryReader;
import org.springframework.util.Assert;

import java.lang.reflect.Field;

/**
 * Base class for a {@link FieldReader}. Checks to see if the {@link FieldReader} read the correct number of bytes.
 *
 * @author Jacob Swanson
 * @since 12/15/2015
 */
public abstract class BaseFieldReader<T> implements FieldReader<T> {

    @Override
    public T read(DatFileReader datFileReader, BinaryReader br, Field field) {
        long startPos = br.getPosition();

        T value = readInternal(datFileReader, br, field);

        long endPos = br.getPosition();

        Assert.isTrue(endPos == startPos + size(field), "number of bytes read incorrect");

        return value;
    }

    protected abstract T readInternal(DatFileReader reader, BinaryReader br, Field field);

}
