package zowe.explorer.api.tree

import ts.Union

external interface NodeSort {
  var method: Union<DatasetSortOpts, JobSortOpts>
  var direction: SortDirection
}
