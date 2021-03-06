package org.cbioportal.persistence;

import org.cbioportal.model.MutSig;
import org.cbioportal.model.meta.BaseMeta;

import java.util.List;

public interface SignificantlyMutatedGeneRepository {

    List<MutSig> getSignificantlyMutatedGenes(String studyId, String projection, Integer pageSize, Integer pageNumber,
                                              String sortBy, String direction);

    BaseMeta getMetaSignificantlyMutatedGenes(String studyId);
}
