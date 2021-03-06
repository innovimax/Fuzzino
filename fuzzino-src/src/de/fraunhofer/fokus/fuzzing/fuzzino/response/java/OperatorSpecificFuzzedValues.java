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
package de.fraunhofer.fokus.fuzzing.fuzzino.response.java;

import java.util.List;

import de.fraunhofer.fokus.fuzzing.fuzzino.FuzzedValue;

/**
 * This class contains all fuzzed values that are created by the same operator.
 * 
 * @author Martin Schneider (martin.schneider@fokus.fraunhofer.de)
 *
 */
public interface OperatorSpecificFuzzedValues<T> extends Iterable<FuzzedValue<T>> {

	/**
	 * @return
	 */
	List<FuzzedValue<T>> getFuzzedValues();
	/**
	 * Sets the list of fuzzed values. If fuzzed values are already contained they will be replaced.
	 * 
	 * @param value The list of fuzzed values to be contained.
	 */
	void setFuzzedValues(List<FuzzedValue<T>> value);
	
	/**
	 * Adds a single fuzzed value.
	 * 
	 * @param value The fuzzed value to be added.
	 */
	void addFuzzedValue(FuzzedValue<T> value);

	/**
	 * @return The valid value from the request the operator is applied to.
	 */
	String getBasedOn();
	
	/**
	 * Sets the valid value the operator is applied to.
	 * 
	 * @param value A valid value from the request.
	 */
	void setBasedOn(String value);
	
	/**
	 * @return The name of the operator that created all fuzzed values.
	 */
	String getName();
	
	/**
	 * Sets the name of the operator.
	 * 
	 * @param value A name of an operator.
	 */
	void setName(String value);
	
	/**
	 * @return Returns the corresponding EMF object {@link de.fraunhofer.fokus.fuzzing.fuzzino.response.OperatorPart}
	 *         initialized with the values of this response.
	 */
	de.fraunhofer.fokus.fuzzing.fuzzino.response.OperatorPart getEMFRepresentation();
}
