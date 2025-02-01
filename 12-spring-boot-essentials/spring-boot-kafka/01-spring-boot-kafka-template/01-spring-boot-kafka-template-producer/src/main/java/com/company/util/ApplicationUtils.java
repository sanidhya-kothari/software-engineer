package com.company.util;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public final class ApplicationUtils {

	private ApplicationUtils() {
		throw new IllegalStateException("cannot create an object of utility class");
	}

	public static boolean isValidCollection(final Collection<?> collection) {
		return Objects.nonNull(collection) && !collection.isEmpty();
	}

	public static String generateJsonFromObject(final Object object) {

		if (Objects.nonNull(object)) {

			final ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.setSerializationInclusion(Include.NON_NULL);

			try {

				return objectMapper.writeValueAsString(object);

			} catch (Exception exception) {

				exception.printStackTrace();

			}

		}

		return null;

	}

	public static <T> T generateObjectFromJson(final String json, final Class<T> clazz, final boolean isList) {

		if (Objects.nonNull(json) && !json.isBlank() && Objects.nonNull(clazz)) {

			final ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

			try {

				if (isList) {

					return objectMapper.readValue(json, TypeFactory.defaultInstance().constructCollectionType(List.class, clazz));

				} else {

					return objectMapper.readValue(json, clazz);

				}

			} catch (Exception exception) {

				exception.printStackTrace();

			}

		}

		return null;

	}

}
