package org.gazzax.labs.solrdf.search.qparser;

import java.io.IOException;

import org.apache.lucene.index.AtomicReaderContext;
import org.apache.lucene.search.Explanation;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.Scorer;
import org.apache.lucene.search.Weight;
import org.apache.lucene.util.Bits;

/**
 * A simple Lucene wrapper for a Jena Query.
 * 
 * @author Andrea Gazzarini
 * @since 1.0
 */
public class SparqlQuery extends Query {
	final com.hp.hpl.jena.query.Query query;
	
	/**
	 * Builds a new query with the given data.
	 * 
	 * @param query the wrapped query.
	 */
	public SparqlQuery(final com.hp.hpl.jena.query.Query query) {
		this.query = query;
	}
	
	public com.hp.hpl.jena.query.Query getQuery() {
		return query;
	}
	
	@Override
	public String toString(final String field) {
		return query.toString();
	}
	
	@Override
	public Weight createWeight(IndexSearcher searcher) throws IOException {
		return new Weight() {
			
			@Override
			public Scorer scorer(AtomicReaderContext context, Bits acceptDocs) throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void normalize(float norm, float topLevelBoost) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public float getValueForNormalization() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Query getQuery() {
				return null;
			}
			
			@Override
			public Explanation explain(AtomicReaderContext context, int doc)
					throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}