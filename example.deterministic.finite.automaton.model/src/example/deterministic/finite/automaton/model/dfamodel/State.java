/**
 */
package example.deterministic.finite.automaton.model.dfamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link example.deterministic.finite.automaton.model.dfamodel.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link example.deterministic.finite.automaton.model.dfamodel.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link example.deterministic.finite.automaton.model.dfamodel.State#getId <em>Id</em>}</li>
 *   <li>{@link example.deterministic.finite.automaton.model.dfamodel.State#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link example.deterministic.finite.automaton.model.dfamodel.State#isIsEnd <em>Is End</em>}</li>
 * </ul>
 *
 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link example.deterministic.finite.automaton.model.dfamodel.Transition}.
	 * It is bidirectional and its opposite is '{@link example.deterministic.finite.automaton.model.dfamodel.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getState_OutgoingTransitions()
	 * @see example.deterministic.finite.automaton.model.dfamodel.Transition#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link example.deterministic.finite.automaton.model.dfamodel.Transition}.
	 * It is bidirectional and its opposite is '{@link example.deterministic.finite.automaton.model.dfamodel.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getState_IncomingTransitions()
	 * @see example.deterministic.finite.automaton.model.dfamodel.Transition#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getState_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link example.deterministic.finite.automaton.model.dfamodel.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Start</em>' attribute.
	 * @see #setIsStart(boolean)
	 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getState_IsStart()
	 * @model
	 * @generated
	 */
	boolean isIsStart();

	/**
	 * Sets the value of the '{@link example.deterministic.finite.automaton.model.dfamodel.State#isIsStart <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Start</em>' attribute.
	 * @see #isIsStart()
	 * @generated
	 */
	void setIsStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Is End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is End</em>' attribute.
	 * @see #setIsEnd(boolean)
	 * @see example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage#getState_IsEnd()
	 * @model
	 * @generated
	 */
	boolean isIsEnd();

	/**
	 * Sets the value of the '{@link example.deterministic.finite.automaton.model.dfamodel.State#isIsEnd <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is End</em>' attribute.
	 * @see #isIsEnd()
	 * @generated
	 */
	void setIsEnd(boolean value);

} // State
