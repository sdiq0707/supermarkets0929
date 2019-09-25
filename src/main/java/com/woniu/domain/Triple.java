package com.woniu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Triple<A,B,C> {
	private A a;
	private B b;
	private C c;
}
