package org.jstl.domain.config;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class JSTLSource {

	private String value;
	private String path;
	
	private List<String> values;
	private String joiner;
	
	
	private List<String> findFirst;
	private List<String> findLast;
	
	private String defaultValue;
	
}
