package com.hzwnrw.insurance.mapper;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class GenericMapper {

    // Convert entity to DTO
    public static <D, E> D mapToDTO(E entity, Class<D> dtoClass) {
        if (entity == null) return null;

        try {
            D dto = dtoClass.getDeclaredConstructor().newInstance();

            // Copy simple properties
            BeanUtils.copyProperties(entity, dto);

            // Handle nested objects and collections
            mapNestedProperties(entity, dto);

            return dto;
        } catch (Exception e) {
            throw new RuntimeException("Mapping failed", e);
        }
    }

    // Convert DTO to entity
    public static <E, D> E mapToEntity(D dto, Class<E> entityClass) {
        if (dto == null) return null;

        try {
            E entity = entityClass.getDeclaredConstructor().newInstance();

            // Copy simple properties
            BeanUtils.copyProperties(dto, entity);

            // Handle nested objects and collections
            mapNestedProperties(dto, entity);

            return entity;
        } catch (Exception e) {
            throw new RuntimeException("Mapping failed", e);
        }
    }

    // Convert list of entities to list of DTOs
    public static <D, E> List<D> mapList(List<E> entities, Class<D> dtoClass) {
        if (entities == null) return Collections.emptyList();
        return entities.stream()
                .map(e -> mapToDTO(e, dtoClass))
                .collect(Collectors.toList());
    }

    // Convert list of DTOs to list of entities
    public static <E, D> List<E> mapEntityList(List<D> dtos, Class<E> entityClass) {
        if (dtos == null) return Collections.emptyList();
        return dtos.stream()
                .map(d -> mapToEntity(d, entityClass))
                .collect(Collectors.toList());
    }

    // Optional: handle arrays
    public static <D, E> D[] mapArray(E[] entities, Class<D> dtoClass) {
        if (entities == null) return null;
        @SuppressWarnings("unchecked")
        D[] dtos = (D[]) Array.newInstance(dtoClass, entities.length);
        for (int i = 0; i < entities.length; i++) {
            dtos[i] = mapToDTO(entities[i], dtoClass);
        }
        return dtos;
    }

    // Private helper for nested objects (shallow handling for now)
    private static void mapNestedProperties(Object source, Object target) {
        // This is a placeholder. You can implement:
        // - Detect fields that are collections or arrays
        // - Recursively map nested objects
        // - Handle date formatting or enums
        // For complex mapping, a library like MapStruct is still better.
    }
}
