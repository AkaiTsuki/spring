package springmvcsample.event;

import java.util.List;

import springmvcsample.domain.Story;

public class StoryListFacade {

	private List<Story> contents;

	public List<Story> getContents() {
		return contents;
	}

	public void setContents(List<Story> content) {
		this.contents = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contents == null) ? 0 : contents.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoryListFacade other = (StoryListFacade) obj;
		if (contents == null) {
			if (other.contents != null)
				return false;
		} else if (!contents.equals(other.contents))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StoryListFacade [content=" + contents + "]";
	}

}
