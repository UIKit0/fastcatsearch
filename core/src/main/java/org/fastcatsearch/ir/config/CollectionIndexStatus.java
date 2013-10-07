package org.fastcatsearch.ir.config;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "collection-index-status")
@XmlType(propOrder = { "fullIndexStatus" ,"failedFullIndexStatus", "addIndexStatus", "failedAddIndexStatus"})
public class CollectionIndexStatus {
	protected IndexStatus fullIndexStatus;
	protected IndexStatus addIndexStatus;
	protected IndexStatus failedFullIndexStatus;
	protected IndexStatus failedAddIndexStatus;
	
	public CollectionIndexStatus copy() {
		CollectionIndexStatus collectionIndexStatus = new CollectionIndexStatus();
		if (fullIndexStatus != null) {
			collectionIndexStatus.fullIndexStatus = fullIndexStatus.copy();
		}
		if (addIndexStatus != null) {
			collectionIndexStatus.addIndexStatus = addIndexStatus.copy();
		}
		return collectionIndexStatus;
	}
	
	public boolean isEmpty() {
		return fullIndexStatus == null && addIndexStatus == null;
	}

	public void clear() {
		fullIndexStatus = null;
		addIndexStatus = null;
	}
	
	@Override
	public String toString() {
		return "["+getClass().getSimpleName()+"] last-full=[" + fullIndexStatus + "] last-add=[" + addIndexStatus + "]";
	}
	
	@XmlElement(name = "last-full-indexing")
	public IndexStatus getFullIndexStatus() {
		return fullIndexStatus;
	}

	public void setFullIndexStatus(IndexStatus fullIndexStatus) {
		this.fullIndexStatus = fullIndexStatus;
	}
	
	@XmlElement(name = "failed-full-indexing")
	public IndexStatus getFailedFullIndexStatus() {
		return failedFullIndexStatus;
	}

	public void setFailedFullIndexStatus(IndexStatus failedFullIndexStatus) {
		this.failedFullIndexStatus = failedFullIndexStatus;
	}
	
	@XmlElement(name = "last-add-indexing")
	public IndexStatus getAddIndexStatus() {
		return addIndexStatus;
	}

	public void setAddIndexStatus(IndexStatus addIndexStatus) {
		this.addIndexStatus = addIndexStatus;
	}
	
	@XmlElement(name = "failed-add-indexing")
	public IndexStatus getFailedAddIndexStatus() {
		return failedAddIndexStatus;
	}

	public void setFailedAddIndexStatus(IndexStatus failedAddIndexStatus) {
		this.failedAddIndexStatus = failedAddIndexStatus;
	}
	
	@XmlType(propOrder = { "duration", "endTime", "startTime", "deleteCount", "updateCount", "insertCount", "documentCount" })
	public static class IndexStatus {
		private int documentCount;
		private int insertCount;
		private int updateCount;
		private int deleteCount;
		private String startTime;
		private String endTime;
		private String duration;
		
		public IndexStatus(){
		}
		
		public IndexStatus(int documentCount, int insertCount, int updateCount, int deleteCount, String startTime, String endTime, String duration){
			this.documentCount = documentCount;
			this.insertCount = insertCount;
			this.updateCount = updateCount;
			this.deleteCount = deleteCount;
			this.startTime = startTime;
			this.endTime = endTime;
			this.duration = duration;
		}
		
		public IndexStatus copy() {
			IndexStatus indexStatus = new IndexStatus();
			indexStatus.documentCount = documentCount;
			indexStatus.insertCount = insertCount;
			indexStatus.updateCount = updateCount;
			indexStatus.deleteCount = deleteCount;
			indexStatus.startTime = startTime;
			indexStatus.endTime = endTime;
			indexStatus.duration = duration;
			return indexStatus;
		}

		@Override
		public String toString() {
			return "[IndexStatus] docs[" + documentCount + "] inserts[" + insertCount  + "] updates[" + updateCount + "] deletes[" + deleteCount + "] start[" + startTime + "]"
					+ "] end[" + endTime + "]" + "] duration[" + duration + "]";
		}

		@XmlAttribute(name = "documents")
		public int getDocumentCount() {
			return documentCount;
		}

		public void setDocumentCount(int documentCount) {
			this.documentCount = documentCount;
		}

		@XmlAttribute(name = "inserts")
		public int getInsertCount() {
			return insertCount;
		}

		public void setInsertCount(int insertCount) {
			this.insertCount = insertCount;
		}
		
		@XmlAttribute(name = "updates")
		public int getUpdateCount() {
			return updateCount;
		}

		public void setUpdateCount(int updateCount) {
			this.updateCount = updateCount;
		}

		@XmlAttribute(name = "deletes")
		public int getDeleteCount() {
			return deleteCount;
		}

		public void setDeleteCount(int deleteCount) {
			this.deleteCount = deleteCount;
		}

		@XmlAttribute(name = "start")
		public String getStartTime() {
			return startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		@XmlAttribute(name = "end")
		public String getEndTime() {
			return endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		@XmlAttribute(name = "duration")
		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

	}
}
