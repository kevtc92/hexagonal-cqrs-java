package com.ktcdev.hexagonalcqrsjava.share.domain;

public interface Converter<E, D> {
    E fromDto(D dto);
    D fromEntity(E entity);
}
