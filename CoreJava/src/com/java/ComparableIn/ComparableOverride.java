package com.java.ComparableIn;

public class ComparableOverride implements java.lang.Comparable
{
		String title;
		int pages;
		public ComparableOverride(String title, int pages) {
			super();
			this.title = title;
			this.pages = pages;
		}
		@Override
		public String toString() {
			return "ComparableOverride [title=" + title + ", pages=" + pages + "]";
		}
		@Override
		public int compareTo(Object x) {
			ComparableOverride b=(ComparableOverride)x;
			//return pages-b.pages;
			return title.compareTo(b.title);
		}
}
