//   Copyright 2012-2013 Fraunhofer FOKUS
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
package de.fraunhofer.fokus.fuzzing.fuzzino.response.java.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.fraunhofer.fokus.fuzzing.fuzzino.response.ResponseFactory;
import de.fraunhofer.fokus.fuzzing.fuzzino.response.java.CollectionResponse;
import de.fraunhofer.fokus.fuzzing.fuzzino.response.java.FuzzedCollection;
import de.fraunhofer.fokus.fuzzing.fuzzino.response.java.WarningsSection;

public class CollectionResponseImpl implements CollectionResponse {

	protected List<FuzzedCollection> fuzzedCollections;
	protected WarningsSection warningsPart;
	protected String id;
	protected boolean moreValues;
	protected String name;
	protected long seed;
	
	@Override
	public List<FuzzedCollection> getFuzzedCollections() {
		return Collections.unmodifiableList(fuzzedCollections);
	}
	
	@Override
	public void setFuzzedCollection(List<FuzzedCollection> value) {
		fuzzedCollections = value;
	}

	@Override
	public void addFuzzedCollection(FuzzedCollection value) {
		if (fuzzedCollections == null) {
			fuzzedCollections = new ArrayList<>();
		}
		fuzzedCollections.add(value);
	}

	@Override
	public WarningsSection getWarningsSection() {
		return warningsPart;
	}

	@Override
	public void setWarningsSection(WarningsSection value) {
		warningsPart = value;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String value) {
		id = value;
	}

	@Override
	public boolean moreValuesAvailable() {
		return moreValues;
	}

	@Override
	public void setMoreValuesAvailable(boolean value) {
		moreValues = value;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String value) {
		name = value;
	}

	@Override
	public long getSeed() {
		return seed;
	}

	@Override
	public void setSeed(long value) {
		seed = value;
	}

	@Override
	public de.fraunhofer.fokus.fuzzing.fuzzino.response.CollectionResponse getEMFRepresentation() {
		de.fraunhofer.fokus.fuzzing.fuzzino.response.CollectionResponse
		  emfCollectionResponse = ResponseFactory.eINSTANCE.createCollectionResponse();
		
		for (FuzzedCollection fuzzedCollection : fuzzedCollections) {
			emfCollectionResponse.getFuzzedCollections().add(fuzzedCollection.getEMFRepresentation());
		}
		
		emfCollectionResponse.setWarnings(getWarningsSection().getEMFRepresentation());
		emfCollectionResponse.setId(getId());
		emfCollectionResponse.setMoreValues(moreValuesAvailable());
		emfCollectionResponse.setName(getName());
		emfCollectionResponse.setSeed(String.valueOf(getSeed()));
		
		return null;
	}
	
	@Override
	public String toString() {
		return "[CollectionResponse name:" + name + " id:" + id + " seed:" + seed + " moreValues:" + moreValues +
			   " fuzzedCollections: " + (fuzzedCollections == null ? "0" : fuzzedCollections.size()) + "]";
	}

}
