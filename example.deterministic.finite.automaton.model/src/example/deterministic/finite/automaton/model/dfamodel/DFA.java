/**
 */
package example.deterministic.finite.automaton.model.dfamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link example.deterministic.finite.automaton.model.dfamodel.DFA#getStates <em>States</em>}</li>
 *   <li>{@link example.deterministic.finite.automaton.model.dfamodel.DFA#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getDFA()
 * @model
 * @generated
 */
public interface DFA extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link example.deterministic.finite.automaton.model.dfamodel.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getDFA_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link example.deterministic.finite.automaton.model.dfamodel.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getDFA_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // DFA
