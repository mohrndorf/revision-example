/**
 */
package example.deterministic.finite.automaton.model.dfamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link example.deterministic.finite.automaton.model.dfamodel.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link example.deterministic.finite.automaton.model.dfamodel.Transition#getTo <em>To</em>}</li>
 *   <li>{@link example.deterministic.finite.automaton.model.dfamodel.Transition#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link example.deterministic.finite.automaton.model.dfamodel.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(State)
	 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getTransition_From()
	 * @see example.deterministic.finite.automaton.model.dfamodel.State#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" required="true"
	 * @generated
	 */
	State getFrom();

	/**
	 * Sets the value of the '{@link example.deterministic.finite.automaton.model.dfamodel.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(State value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link example.deterministic.finite.automaton.model.dfamodel.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(State)
	 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getTransition_To()
	 * @see example.deterministic.finite.automaton.model.dfamodel.State#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true"
	 * @generated
	 */
	State getTo();

	/**
	 * Sets the value of the '{@link example.deterministic.finite.automaton.model.dfamodel.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(State value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getTransition_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link example.deterministic.finite.automaton.model.dfamodel.Transition#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

} // Transition
