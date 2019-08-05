package org.jstlang.domain.definition.step;

import org.jstlang.domain.definition.PathDef;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class IterableDef {

    private PathDef entries;

}