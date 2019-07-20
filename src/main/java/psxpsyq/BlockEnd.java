package psxpsyq;

public final class BlockEnd {
	private final int section;
	private final long offset;
	private final long endLine;
	
	public final int getSection() {
		return section;
	}

	public final long getOffset() {
		return offset;
	}
	
	public final long getEndLine() {
		return endLine;
	}

	public BlockEnd(int section, long offset, long endLine) {
		this.section = section;
		this.offset = offset;
		this.endLine = endLine;
	}
}
