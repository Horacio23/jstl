package org.jstl.domain.config;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class JSTLString {

	private JSTLStringCase applyCase;
	private JSTLSubString subString;
	private JSTLCharPadding charPadding;
}
