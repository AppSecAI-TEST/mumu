package org.yc.kafka.indexer.jobs;

public enum IndexerJobStatusEnum {

	Created,
	Initialized,
	Started,
	InProgress,
	Hanging,
	Stopped,
	Cancelled,
	Failed
	
}
