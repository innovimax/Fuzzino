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
package de.fraunhofer.fokus.fuzzing.fuzzino.response.impl;

import de.fraunhofer.fokus.fuzzing.fuzzino.response.CollectionResponse;
import de.fraunhofer.fokus.fuzzing.fuzzino.response.FuzzedCollection;
import de.fraunhofer.fokus.fuzzing.fuzzino.response.ResponsePackage;
import de.fraunhofer.fokus.fuzzing.fuzzino.response.WarningsPart;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.fokus.fuzzing.fuzzino.response.impl.CollectionResponseImpl#getFuzzedCollections <em>Fuzzed Collections</em>}</li>
 *   <li>{@link de.fraunhofer.fokus.fuzzing.fuzzino.response.impl.CollectionResponseImpl#getWarnings <em>Warnings</em>}</li>
 *   <li>{@link de.fraunhofer.fokus.fuzzing.fuzzino.response.impl.CollectionResponseImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.fraunhofer.fokus.fuzzing.fuzzino.response.impl.CollectionResponseImpl#isMoreValues <em>More Values</em>}</li>
 *   <li>{@link de.fraunhofer.fokus.fuzzing.fuzzino.response.impl.CollectionResponseImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.fokus.fuzzing.fuzzino.response.impl.CollectionResponseImpl#getSeed <em>Seed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionResponseImpl extends EObjectImpl implements CollectionResponse {
	/**
	 * The cached value of the '{@link #getFuzzedCollections() <em>Fuzzed Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuzzedCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<FuzzedCollection> fuzzedCollections;

	/**
	 * The cached value of the '{@link #getWarnings() <em>Warnings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarnings()
	 * @generated
	 * @ordered
	 */
	protected WarningsPart warnings;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isMoreValues() <em>More Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoreValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MORE_VALUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMoreValues() <em>More Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoreValues()
	 * @generated
	 * @ordered
	 */
	protected boolean moreValues = MORE_VALUES_EDEFAULT;

	/**
	 * This is true if the More Values attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moreValuesESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected static final String SEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected String seed = SEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResponsePackage.Literals.COLLECTION_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FuzzedCollection> getFuzzedCollections() {
		if (fuzzedCollections == null) {
			fuzzedCollections = new EObjectContainmentEList<FuzzedCollection>(FuzzedCollection.class, this, ResponsePackage.COLLECTION_RESPONSE__FUZZED_COLLECTIONS);
		}
		return fuzzedCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarningsPart getWarnings() {
		return warnings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarnings(WarningsPart newWarnings, NotificationChain msgs) {
		WarningsPart oldWarnings = warnings;
		warnings = newWarnings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResponsePackage.COLLECTION_RESPONSE__WARNINGS, oldWarnings, newWarnings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarnings(WarningsPart newWarnings) {
		if (newWarnings != warnings) {
			NotificationChain msgs = null;
			if (warnings != null)
				msgs = ((InternalEObject)warnings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResponsePackage.COLLECTION_RESPONSE__WARNINGS, null, msgs);
			if (newWarnings != null)
				msgs = ((InternalEObject)newWarnings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResponsePackage.COLLECTION_RESPONSE__WARNINGS, null, msgs);
			msgs = basicSetWarnings(newWarnings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.COLLECTION_RESPONSE__WARNINGS, newWarnings, newWarnings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.COLLECTION_RESPONSE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoreValues() {
		return moreValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoreValues(boolean newMoreValues) {
		boolean oldMoreValues = moreValues;
		moreValues = newMoreValues;
		boolean oldMoreValuesESet = moreValuesESet;
		moreValuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.COLLECTION_RESPONSE__MORE_VALUES, oldMoreValues, moreValues, !oldMoreValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoreValues() {
		boolean oldMoreValues = moreValues;
		boolean oldMoreValuesESet = moreValuesESet;
		moreValues = MORE_VALUES_EDEFAULT;
		moreValuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResponsePackage.COLLECTION_RESPONSE__MORE_VALUES, oldMoreValues, MORE_VALUES_EDEFAULT, oldMoreValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoreValues() {
		return moreValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.COLLECTION_RESPONSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeed() {
		return seed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeed(String newSeed) {
		String oldSeed = seed;
		seed = newSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResponsePackage.COLLECTION_RESPONSE__SEED, oldSeed, seed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResponsePackage.COLLECTION_RESPONSE__FUZZED_COLLECTIONS:
				return ((InternalEList<?>)getFuzzedCollections()).basicRemove(otherEnd, msgs);
			case ResponsePackage.COLLECTION_RESPONSE__WARNINGS:
				return basicSetWarnings(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResponsePackage.COLLECTION_RESPONSE__FUZZED_COLLECTIONS:
				return getFuzzedCollections();
			case ResponsePackage.COLLECTION_RESPONSE__WARNINGS:
				return getWarnings();
			case ResponsePackage.COLLECTION_RESPONSE__ID:
				return getId();
			case ResponsePackage.COLLECTION_RESPONSE__MORE_VALUES:
				return isMoreValues();
			case ResponsePackage.COLLECTION_RESPONSE__NAME:
				return getName();
			case ResponsePackage.COLLECTION_RESPONSE__SEED:
				return getSeed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResponsePackage.COLLECTION_RESPONSE__FUZZED_COLLECTIONS:
				getFuzzedCollections().clear();
				getFuzzedCollections().addAll((Collection<? extends FuzzedCollection>)newValue);
				return;
			case ResponsePackage.COLLECTION_RESPONSE__WARNINGS:
				setWarnings((WarningsPart)newValue);
				return;
			case ResponsePackage.COLLECTION_RESPONSE__ID:
				setId((String)newValue);
				return;
			case ResponsePackage.COLLECTION_RESPONSE__MORE_VALUES:
				setMoreValues((Boolean)newValue);
				return;
			case ResponsePackage.COLLECTION_RESPONSE__NAME:
				setName((String)newValue);
				return;
			case ResponsePackage.COLLECTION_RESPONSE__SEED:
				setSeed((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResponsePackage.COLLECTION_RESPONSE__FUZZED_COLLECTIONS:
				getFuzzedCollections().clear();
				return;
			case ResponsePackage.COLLECTION_RESPONSE__WARNINGS:
				setWarnings((WarningsPart)null);
				return;
			case ResponsePackage.COLLECTION_RESPONSE__ID:
				setId(ID_EDEFAULT);
				return;
			case ResponsePackage.COLLECTION_RESPONSE__MORE_VALUES:
				unsetMoreValues();
				return;
			case ResponsePackage.COLLECTION_RESPONSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResponsePackage.COLLECTION_RESPONSE__SEED:
				setSeed(SEED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResponsePackage.COLLECTION_RESPONSE__FUZZED_COLLECTIONS:
				return fuzzedCollections != null && !fuzzedCollections.isEmpty();
			case ResponsePackage.COLLECTION_RESPONSE__WARNINGS:
				return warnings != null;
			case ResponsePackage.COLLECTION_RESPONSE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ResponsePackage.COLLECTION_RESPONSE__MORE_VALUES:
				return isSetMoreValues();
			case ResponsePackage.COLLECTION_RESPONSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResponsePackage.COLLECTION_RESPONSE__SEED:
				return SEED_EDEFAULT == null ? seed != null : !SEED_EDEFAULT.equals(seed);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", moreValues: ");
		if (moreValuesESet) result.append(moreValues); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", seed: ");
		result.append(seed);
		result.append(')');
		return result.toString();
	}

} //CollectionResponseImpl
