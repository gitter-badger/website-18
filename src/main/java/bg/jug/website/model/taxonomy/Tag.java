package bg.jug.website.model.taxonomy;

import java.util.HashSet;
import java.util.Set;

import bg.jug.website.model.cms.Page;

public class Tag {
	private String name;
	
	private Set<Page> pages = new HashSet<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Page> getPages() {
		return pages;
	}

	public void setPages(Set<Page> pages) {
		this.pages = pages;
	}
}
