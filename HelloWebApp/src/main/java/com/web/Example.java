package com.web;

import com.google.sitebricks.At;
import com.google.sitebricks.rendering.Decorated;

@At("/")
@Decorated
public class Example extends Layout {
	private String message = "Hello";
	private boolean appear = true;

	public boolean getAppear() { return appear; }
	public void setAppear(boolean appear) { this.appear = appear; }
	public String getMessage() { return message; }
}
