package org.itsimulator.germes.app.model.search.criteria.range;

import org.itsimulator.germes.app.infra.util.Checks;

import com.google.common.base.Preconditions;

public class RangeCriteria {
	/**
	 * Page index(0-based)
	 */
	private final int page;
	/**
	 * Number of elements per page
	 */
	private final int rowCount;

	public RangeCriteria(final int page, final int rowCount) {
		Preconditions.checkArgument(page >= 0, "Incorrect page index:%s", page);
        Preconditions.checkArgument(rowCount >= 0, "Incorrect row count:%s",rowCount);
        
		Checks.checkParameter(page >= 0, "Incorrect page index:" + page);
        Checks.checkParameter(rowCount >= 0, "Incorrect row count:" + rowCount);
//        
//        if (page < 0) {
//               throw new InvalidParameterException("Incorrect page index:" + page);
//        }
//        if(rowCount < 0) {
//               throw new InvalidParameterException("Incorrect row count:" + rowCount);
//        }
        this.page = page;
        this.rowCount = rowCount;
  }

	public int getPage() {
		return page;
	}

	public int getRowCount() {
		return rowCount;
	}

}
